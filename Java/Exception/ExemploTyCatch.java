package Exception;

import javax.swing.JOptionPane;

public class ExemploTyCatch {
    public static void main(String[] args) {
        boolean calculadora = true;
        int n1 = 0, n2 = 0;
        while (calculadora) {
            int operacaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha a operação desejada:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"));
            if (operacaoEscolhida == 1) {
                boolean soma = true;
                while (soma) {
                    try {
                        boolean n1ok = true;
                        while (n1ok) {
                            try {
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
                                n1ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        boolean n2ok = true;
                        while (n2ok) {
                            try {
                                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
                                n2ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Resultado: " + n1 + "+" + n2 + "=" + (n1 + n2));
                        calculadora = false;
                        soma = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                    }
                }
            }
            if (operacaoEscolhida == 2) {
                boolean subtracao = true;
                while (subtracao) {
                    try {
                        boolean n1ok = true;
                        while (n1ok) {
                            try {
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
                                n1ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        boolean n2ok = true;
                        while (n2ok) {
                            try {
                                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
                                n2ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Resultado: " + n1 + "-" + n2 + "=" + (n1 - n2));
                        calculadora = false;
                        subtracao = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                    }
                }
            }
            if (operacaoEscolhida == 3) {
                boolean multiplicacao = true;
                while (multiplicacao) {
                    try {
                        boolean n1ok = true;
                        while (n1ok) {
                            try {
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
                                n1ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        boolean n2ok = true;
                        while (n2ok) {
                            try {
                                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
                                n2ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Resultado: " + n1 + "x" + n2 + "=" + (n1 * n2));
                        calculadora = false;
                        multiplicacao = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                    }
                }
            }
            if (operacaoEscolhida == 4) {
                boolean divisao = true;
                while (divisao) {
                    try {
                        boolean n1ok = true;
                        while (n1ok) {
                            try {
                                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
                                n1ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro! O número digitado não é inteiro.");
                            }
                        }
                        boolean n2ok = true;
                        while (n2ok) {
                            try {
                                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
                                n2ok = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null,
                                        "Erro! O número digitado não é inteiro ou é menor que 1.");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Resultado: " + n1 + "÷" + n2 + "=" + (n1 / n2));
                        calculadora = false;
                        divisao = false;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                "Erro! O segundo número digitado não é inteiro.");
                    } catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null,
                                "Erro! Não é possível dividir por zero.");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Erro!");
                    }
                }
            }
        }
    }
}
