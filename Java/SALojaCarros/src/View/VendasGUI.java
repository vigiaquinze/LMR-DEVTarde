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
import Control.CarrosDAO;
import Model.Carros;

public class VendasGUI extends JPanel {

    // atributos (componentes)
    private JTextField inputCPF;
    private JTextField inputPlaca;
    private JTextField inputPreco;
    private int linhaSelecionada = -1;
    private JButton venderButton;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Carros> carro = new ArrayList<>();

    // construtor(GUI-JPanel)
    public VendasGUI() {
        // construindo a tabela
        // criando os métodos de entrada de dados (input)
        inputCPF = new JTextField(10);
        inputPlaca = new JTextField(10);
        inputPreco = new JTextField(10);
        venderButton = new JButton("Vender");
        // adicionando os inputs
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("CPF:"));
        inputPanel.add(inputCPF);
        inputPanel.add(new JLabel("Placa:"));
        inputPanel.add(inputPlaca);
        inputPanel.add(new JLabel("Preço:"));
        inputPanel.add(inputPreco);
        inputPanel.add(venderButton);
        // setando layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        // botões de eventos

        CarrosControl operacoes = new CarrosControl(carro, tableModel, table);

        venderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarCarro(inputPlaca.getText());
            }
        });
        // tabela de carros
    }

}
