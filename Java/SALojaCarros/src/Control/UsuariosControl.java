package Control;

import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

import Model.Usuarios;
import View.UsuariosGUI;

public class UsuariosControl {
    // atributos
    private List<Usuarios> usuario;
    private DefaultTableModel tableModel;
    private JTable table;

    // ctor
    public UsuariosControl(List<Usuarios> usuario, DefaultTableModel tableModel, JTable table) {
        this.usuario = usuario;
        this.tableModel = tableModel;
        this.table = table;
    }

    // CRUD
    public void cadastrarUsuario(String nome, String cpf) {
        Usuarios usuarios = new Usuarios(nome, cpf);
        new UsuariosDAO().cadastrar(nome, cpf);
        usuario.add(usuarios);
        atualizarTabela();
    }

    public void editarUsuario(int linhaSelecionada, String nome, String cpf) {
        if (linhaSelecionada != -1) {
            Usuarios usuarios = new Usuarios(nome, cpf);
            new UsuariosDAO().atualizar(nome, cpf);
            usuario.set(linhaSelecionada, usuarios);
            atualizarTabela();
        }
    }

    public void apagarUsuario(String cpf) {
        new UsuariosDAO().apagar(cpf);
        atualizarTabela();
    }

    public void atualizar(String nome, String cpf) {
        new UsuariosDAO().atualizar(nome, cpf);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuarios usuarios : usuario) {
            tableModel.addRow(new Object[] { usuarios.getNome(), usuarios.getCpf() });
        }
    }
}
