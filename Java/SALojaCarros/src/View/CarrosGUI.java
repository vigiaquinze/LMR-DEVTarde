package View;

import javax.swing.*;
import java.util.*;
import java.util.List;

import javax.swing.table.*;

import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import Control.CarrosControl;
import Model.Carros;

public class CarrosGUI extends JPanel{

    //atributos (componentes)
    private JTextField inputPlaca;
    private JTextField inputModelo;
    private JTextField inputMarca;
    private JTextField inputCor;
    private JTextField inputAno;
    private JTextField inputPreco;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Carros> carro = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, editarButton, apagarButton;
    //construtor(GUI-JPanel)
    public CarrosGUI() {
        //construindo a tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Placa");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Cor");
        tableModel.addColumn("Ano");
        tableModel.addColumn("Preço");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        //criando os métodos de entrada de dados (input)
        inputPlaca = new JTextField(10);
        inputModelo = new JTextField(10);
        inputMarca = new JTextField(10);
        inputCor = new JTextField(10);
        inputAno = new JTextField(10);
        inputPreco = new JTextField(10);
        cadastrarButton = new JButton("Cadastrar");
        editarButton = new JButton("Editar");
        apagarButton = new JButton("Apagar");
        //adicionando os inputs
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Placa:"));
        inputPanel.add(inputPlaca);
        inputPanel.add(new JLabel("Modelo:"));
        inputPanel.add(inputModelo);
        inputPanel.add(new JLabel("Marca:"));
        inputPanel.add(inputMarca);
        inputPanel.add(new JLabel("Cor:"));
        inputPanel.add(inputCor);
        inputPanel.add(new JLabel("Ano:"));
        inputPanel.add(inputAno);
        inputPanel.add(new JLabel("Preço:"));
        inputPanel.add(inputPreco);
        inputPanel.add(cadastrarButton);
        inputPanel.add(editarButton);
        inputPanel.add(apagarButton);
        //setando layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        //botões de eventos

        CarrosControl operacoes = new CarrosControl(carro, tableModel, table);
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputPlaca.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputModelo.setText((String) table.getValueAt(linhaSelecionada, 1));
                    inputMarca.setText((String) table.getValueAt(linhaSelecionada, 2));
                    inputCor.setText((String) table.getValueAt(linhaSelecionada, 3));
                    inputAno.setText(table.getValueAt(linhaSelecionada, 4).toString());
                    inputPreco.setText(table.getValueAt(linhaSelecionada, 5).toString());
                }
            }
        });

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarCarro(inputPlaca.getText(), inputModelo.getText(), inputMarca.getText(), inputCor.getText(), inputAno.getText(), inputPreco.getText());
                inputPlaca.setText("");
                inputModelo.setText("");
                inputMarca.setText("");
                inputCor.setText("");
                inputAno.setText("");
                inputPreco.setText("");
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.editarCarro(linhaSelecionada, inputPlaca.getText(), inputModelo.getText(), inputMarca.getText(), inputCor.getText(), inputAno.getText(), inputPreco.getText());

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarCarro(inputPlaca.getText());
            }
        });
        //tabela de carros
    }
}
