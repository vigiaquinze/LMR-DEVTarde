package View;

import javax.swing.*;
import java.util.*;
import java.util.List;

import javax.swing.table.*;

import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import Control.UsuariosControl;
import Control.UsuariosDAO;
import Model.Usuarios;

public class UsuariosGUI extends JPanel{

    //atributos (componentes)
    private JTextField inputCpf;
    private JTextField inputNome;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Usuarios> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, editarButton, apagarButton;
    //construtor(GUI-JPanel)
    public UsuariosGUI() {
        //construindo a tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("CPF");
        tableModel.addColumn("Nome");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        //criando os métodos de entrada de dados (input)
        inputCpf = new JTextField(10);
        inputNome = new JTextField(20);
        cadastrarButton = new JButton("Cadastrar");
        editarButton = new JButton("Editar");
        apagarButton = new JButton("Apagar");
        //adicionando os inputs
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("CPF:"));
        inputPanel.add(inputCpf);
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(cadastrarButton);
        inputPanel.add(editarButton);
        inputPanel.add(apagarButton);
        atualizarTabela();
        //setando layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        //botões de eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputCpf.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 1));
                }
            }
        });
        UsuariosControl operacoes = new UsuariosControl(usuarios, tableModel, table);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarUsuario(inputCpf.getText(), inputNome.getText());
                inputCpf.setText("");
                inputNome.setText("");
                JOptionPane.showMessageDialog(getComponentPopupMenu(), "Cliente cadastrado.");
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.editarUsuario(linhaSelecionada, inputCpf.getText(), inputNome.getText());
                JOptionPane.showMessageDialog(getComponentPopupMenu(), "Cliente editado.");
            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(inputCpf.getText());
                JOptionPane.showMessageDialog(getComponentPopupMenu(), "Cliente removido.");
            }
        });
        //tabela de Usuarios
    }
    private void atualizarTabela() {
        usuarios = new UsuariosDAO().listarTodos();
        tableModel.setRowCount(0);
        for (Usuarios usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getCpf() });
        }
    }
}
