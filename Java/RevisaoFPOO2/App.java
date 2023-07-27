package RevisaoFPOO2;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Aves;
import RevisaoFPOO2.Agenda.AgendaConsulta;

public class App {
    public static void main(String[] args) {
        boolean app = true;
        while (app) {
            boolean agendando = false;
            boolean consultando = false;
            String[] horariosAgenda = { "13h", "13h30", "14h", "14h30", "15h", "15h30", "16h" };
            AgendaConsulta pessoasAgendadas[] = new AgendaConsulta[7];
            int contAgendamentos = 0;
            int acaoEscolhida1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "AGENDA DE CONSULTAS\n\nO que deseja fazer?\n1 - Agendar uma consulta\n2 - Conferir dados de uma consulta agendada"));
            if (acaoEscolhida1 == 1) {
                agendando = true;
                while (agendando) {
                    pessoasAgendadas[contAgendamentos] = new AgendaConsulta();
                    pessoasAgendadas[contAgendamentos].setNomeCompleto(JOptionPane.showInputDialog(null, "Digite seu nome:"));
                    pessoasAgendadas[contAgendamentos].setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF:"));
                    pessoasAgendadas[contAgendamentos].setHorarioEscolhido(JOptionPane.showInputDialog(null,"Escolha um item", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,horariosAgenda, horariosAgenda[0]));
                    JOptionPane.showMessageDialog(null, "Consulta agendada!");
                    agendando=false;
                }
            } else if (acaoEscolhida1 == 2) {
                consultando = true;
                while (consultando) {

                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro!", "Escolha uma das opções apresentadas",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
