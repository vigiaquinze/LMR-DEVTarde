package Control;

import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

import Model.Carros;
import View.CarrosGUI;

public class CarrosControl {
    // atributos
    private List<Carros> carro;
    private DefaultTableModel tableModel;
    private JTable table;

    // ctor
    public CarrosControl(List<Carros> carro, DefaultTableModel tableModel, JTable table) {
        this.carro = carro;
        this.tableModel = tableModel;
        this.table = table;
    }

    // CRUD
    public void cadastrarCarro(String marca, String modelo, String ano, String cor, String placa, String valor) {
        Carros carros = new Carros(marca, modelo, ano, cor, placa, valor);
        new CarrosDAO().cadastrar(marca, modelo, ano, cor, placa, valor);
        carro.add(carros);
        atualizarTabela();
    }

    public void editarCarro(int linhaSelecionada, String marca, String modelo, String ano, String cor, String placa,
            String valor) {
        if (linhaSelecionada != -1) {
            Carros carros = new Carros(marca, modelo, ano, cor, placa, valor);
            new CarrosDAO().atualizar(marca, modelo, ano, cor, placa, valor);
            carro.set(linhaSelecionada, carros);
            atualizarTabela();
        }
    }

    public void apagarCarro(String placa) {
        new CarrosDAO().apagar(placa);
    }

    public void atualizar(String marca, String modelo, String ano, String cor, String placa, String valor) {
        new CarrosDAO().atualizar(marca, modelo, ano, cor, placa, valor);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    private void atualizarTabela() {
        carro = new CarrosDAO().listarTodos();
        tableModel.setRowCount(0);
        for (Carros carros : carro) {
            tableModel.addRow(new Object[] { carros.getMarca(), carros.getModelo(), carros.getAno(), carros.getCor(),
                    carros.getPlaca(), carros.getValor() });
        }
    }
}
