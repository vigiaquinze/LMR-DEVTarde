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
    //ctor
    public CarrosControl(List<Carros> carro, DefaultTableModel tableModel, JTable table) {
        this.carro = carro;
        this.tableModel = tableModel;
        this.table = table;
    }
    //CRUD
    public void cadastrarCarro(String marca, String modelo, String ano, String cor, String placa, String preco) {
        Carros carros = new Carros(marca, modelo, ano, cor, placa, preco);
        carro.add(carros);
        atualizarTabela();
    }
    
    public void editarCarro(int linhaSelecionada, String marca, String modelo, String ano, String cor, String placa, String preco) {
        if (linhaSelecionada != -1) {
            Carros carros = new Carros(marca, modelo, ano, cor, placa, preco);
            carro.set(linhaSelecionada, carros);
            atualizarTabela();
        }
    }

    public void apagarCarro(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            carro.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Carros carros : carro) {
            tableModel.addRow(new Object[] { carros.getMarca(), carros.getModelo(), carros.getAno(), carros.getCor(), carros.getPlaca(), carros.getPreco() });
        }
    }
}
