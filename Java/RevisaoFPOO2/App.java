package RevisaoFPOO2;

import javax.swing.JOptionPane;

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
            pessoasAgendadas[contAgendamentos] = new AgendaConsulta();
            int acaoEscolhida1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "AGENDA DE CONSULTAS\n\nO que deseja fazer?\n1 - Agendar uma consulta\n2 - Conferir dados de uma consulta agendada"));
            if (acaoEscolhida1 == 1) {
                agendando = true;
                while (agendando) {
                    pessoasAgendadas[contAgendamentos]
                            .setNomeCompleto(JOptionPane.showInputDialog(null, "Digite seu nome:"));
                    pessoasAgendadas[contAgendamentos].setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF:"));
                    pessoasAgendadas[contAgendamentos].setHorarioEscolhido(
                            JOptionPane.showInputDialog(null, "Escolha um horário abaixo:", "Agendando consulta",
                                    JOptionPane.INFORMATION_MESSAGE, null, horariosAgenda, horariosAgenda[0]));
                    JOptionPane.showMessageDialog(null, "Consulta agendada!");
                    JOptionPane.showMessageDialog(null,
                            "DADOS DE CONSULTA\n\nNome: " + pessoasAgendadas[contAgendamentos].getNomeCompleto()
                                    + "\nCPF: " + pessoasAgendadas[contAgendamentos].getCpf() + "\nHorário: "
                                    + pessoasAgendadas[contAgendamentos].getHorarioEscolhido());
                    contAgendamentos++;
                    agendando = false;
                    contAgendamentos++;
                }
            } else if (acaoEscolhida1 == 2) {
                consultando = true;
                while (consultando) {
                    boolean busca = true;
                    int contAgendamentos2 = 0;
                    while (busca) {
                        JOptionPane.showMessageDialog(null, +contAgendamentos);
                        if (contAgendamentos != 0) {
                            System.out.println("Conferir dados de uma consulta agendada");
                            JOptionPane.showMessageDialog(null, "Conferir dados de uma consulta agendada");
                            String buscarCPF = JOptionPane.showInputDialog(null, "Digite seu CPF:");
                            for (int i = 0; i < contAgendamentos; i++) {
                                if (buscarCPF.equals(pessoasAgendadas[contAgendamentos2].getCpf())) {
                                    JOptionPane.showMessageDialog(null,
                                            "DADOS DE CONSULTA\nNome: "
                                                    + pessoasAgendadas[contAgendamentos2].getNomeCompleto() +
                                                    "\nCPF: " + pessoasAgendadas[contAgendamentos2].getCpf() +
                                                    "\nHorário: "
                                                    + pessoasAgendadas[contAgendamentos2].getHorarioEscolhido());
                                    busca = false;
                                    consultando = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "CPF não encontrado!");
                                    contAgendamentos2++;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhum horário foi cadastrado ainda.");
                            busca = false;
                            consultando = false;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro!", "Escolha uma das opções apresentadas",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
