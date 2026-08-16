import javax.swing.JOptionPane;

public class Teatro {

    public static void main(String[] args) {
        char coluna;
        int opcao, g, i, c, sala, linha, livre = 144, colunaint = 0, reservada = 0, ocupada = 0, saldo = 0, saldoreserva = 0;
        int livre1 = 144, reservada1 = 0, ocupada1 = 0, saldo1 = 0, saldoreserva1 = 0;
        int livre2 = 144, reservada2 = 0, ocupada2 = 0, saldo2 = 0, saldoreserva2 = 0;
        String[] letras = {"    A", "  B", "  C ", " D", "  E", "  F", "  G", "  H", "  I", "  J", "  K", "  L"};
        String[] numeros = {"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "11", "12"};

        String[][][] bancos = new String[3][12][12];

        // Declarando na Matriz
        for (g = 0; g < 3; g++) {
            for (i = 0; i < 12; i++) {
                for (c = 0; c < 12; c++) {
                    bancos[g][i][c] = "[ ]";
                }
            }
        }

        do {
            String menu = "------------------------------------\n"
                        + "          TEATRO DEVISATE           \n"
                        + "------------------------------------\n"
                        + "1 - Listar Salas\n"
                        + "2 - Exibir Mapa da Sala\n"
                        + "3 - Reservar Cadeira\n"
                        + "4 - Cancelar Reserva de uma Cadeira\n"
                        + "5 - Comprar Cadeira\n"
                        + "6 - Relatório Financeiro\n"
                        + "7 - Sair\n"
                        + "Digite sua opção:";
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 7:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso programa!\n");
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "LISTA DE SALAS\n\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                    break;

                case 2:
                    sala = Integer.parseInt(JOptionPane.showInputDialog("MAPA DAS SALA\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\nEscolha a sala:"));
                    if (sala > 3 || sala < 1) {
                        JOptionPane.showMessageDialog(null, "Erro: Sala Inexistente.\n");
                        break;
                    }

                    if (sala == 1) {
                        sala = sala - 1;
                        String mapa = "Espetaculo: A queda do gato\n\n";
                        for (i = 0; i < letras.length; i++) {
                            mapa += letras[i];
                        }
                        mapa += "\n";
                        for (i = 0; i < 12; i++) {
                            mapa += numeros[i] + " ";
                            for (c = 0; c < 12; c++) {
                                mapa += bancos[sala][i][c];
                            }
                            mapa += "\n";
                        }
                        mapa += (sala == 0 ? "Livre: " + livre + " Reservadas: " + reservada + " Ocupadas: " + ocupada + "\n" : sala == 1 ? "Livre: " + livre1 + " Reservadas: " + reservada1 + " Ocupadas: " + ocupada1 + "\n" : "Livre: " + livre2 + " Reservadas: " + reservada2 + " Ocupadas: " + ocupada2 + "\n");
                        JOptionPane.showMessageDialog(null, mapa);
                    } else if (sala == 2) {
                        sala = sala - 1;
                        String mapa = "Espetaculo: Pocoyo e seus amigos vao para uma aventura\n\n";
                        for (i = 0; i < letras.length; i++) {
                            mapa += letras[i];
                        }
                        mapa += "\n";
                        for (i = 0; i < 12; i++) {
                            mapa += numeros[i] + " ";
                            for (c = 0; c < 12; c++) {
                                mapa += bancos[sala][i][c];
                            }
                            mapa += "\n";
                        }
                        mapa += (sala == 0 ? "Livre: " + livre + " Reservadas: " + reservada + " Ocupadas: " + ocupada + "\n" : sala == 1 ? "Livre: " + livre1 + " Reservadas: " + reservada1 + " Ocupadas: " + ocupada1 + "\n" : "Livre: " + livre2 + " Reservadas: " + reservada2 + " Ocupadas: " + ocupada2 + "\n");
                        JOptionPane.showMessageDialog(null, mapa);
                    } else if (sala == 3) {
                        sala = sala - 1;
                        String mapa = "Espetaculo: Raposo rouba a casa da formiga\n\n";
                        for (i = 0; i < letras.length; i++) {
                            mapa += letras[i];
                        }
                        mapa += "\n";
                        for (i = 0; i < 12; i++) {
                            mapa += numeros[i] + " ";
                            for (c = 0; c < 12; c++) {
                                mapa += bancos[sala][i][c];
                            }
                            mapa += "\n";
                        }
                        mapa += (sala == 0 ? "Livre: " + livre + " Reservadas: " + reservada + " Ocupadas: " + ocupada + "\n" : sala == 1 ? "Livre: " + livre1 + " Reservadas: " + reservada1 + " Ocupadas: " + ocupada1 + "\n" : "Livre: " + livre2 + " Reservadas: " + reservada2 + " Ocupadas: " + ocupada2 + "\n");
                        JOptionPane.showMessageDialog(null, mapa);
                    }
                    break;

                case 3:
                    sala = Integer.parseInt(JOptionPane.showInputDialog("RESERVAR CADEIRA\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\nEscolha a sala:"));
                    sala = sala - 1;

                    String mapa3 = "";
                    for (i = 0; i < letras.length; i++) {
                        mapa3 += letras[i];
                    }
                    mapa3 += "\n";
                    for (i = 0; i < 12; i++) {
                        mapa3 += numeros[i] + " ";
                        for (c = 0; c < 12; c++) {
                            mapa3 += bancos[sala][i][c];
                        }
                        mapa3 += "\n";
                    }
                    mapa3 += (sala == 0 ? "Livre: " + livre + " Reservadas: " + reservada + " Ocupadas: " + ocupada + "\n" : sala == 1 ? "Livre: " + livre1 + " Reservadas: " + reservada1 + " Ocupadas: " + ocupada1 + "\n" : "Livre: " + livre2 + " Reservadas: " + reservada2 + " Ocupadas: " + ocupada2 + "\n");
                    JOptionPane.showMessageDialog(null, mapa3);

                    coluna = JOptionPane.showInputDialog("Digite qual coluna você quer(A-L):").charAt(0);
                    colunaint = Character.toUpperCase(coluna) - 64;
                    if (colunaint > 12 || colunaint < 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Letra invalida(A-L)\n");
                        break;
                    }

                    linha = Integer.parseInt(JOptionPane.showInputDialog("Digite qual linha voce quer(1-12):"));
                    colunaint = colunaint - 1;
                    linha = linha - 1;
                    if (linha < 0 || linha > 12) {
                        JOptionPane.showMessageDialog(null, "Erro: Numero invalido(1-12)\n");
                        break;
                    }
                    if (bancos[sala][linha][colunaint].equals("[R]")) {
                        JOptionPane.showMessageDialog(null, "Esta cadeira ja esta reservada[R].\n");
                        break;
                    }

                    if (bancos[sala][linha][colunaint].equals("[X]")) {
                        JOptionPane.showMessageDialog(null, "Erro: Voce nao pode reservar uma cadeira ja comprada[X].\n");
                        break;
                    }

                    bancos[sala][linha][colunaint] = "[R]";
                    if (sala == 0) {
                        reservada = reservada + 1;
                        livre = livre - 1;
                        saldoreserva = saldoreserva + 50;
                    } else if (sala == 1) {
                        reservada1 = reservada1 + 1;
                        livre1 = livre1 - 1;
                        saldoreserva1 = saldoreserva1 + 50;
                    } else if (sala == 2) {
                        reservada2 = reservada2 + 1;
                        livre2 = livre2 - 1;
                        saldoreserva2 = saldoreserva2 + 50;
                    }
                    break;

                case 4:
                    sala = Integer.parseInt(JOptionPane.showInputDialog("CANCELAR RESERVA CADEIRA\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\nEscolha a sala:"));
                    sala = sala - 1;

                    String mapa4 = "";
                    for (i = 0; i < letras.length; i++) {
                        mapa4 += letras[i];
                    }
                    mapa4 += "\n";
                    for (i = 0; i < 12; i++) {
                        mapa4 += numeros[i] + " ";
                        for (c = 0; c < 12; c++) {
                            mapa4 += bancos[sala][i][c];
                        }
                        mapa4 += "\n";
                    }
                    mapa4 += (sala == 0 ? "Livre: " + livre + " Reservadas: " + reservada + " Ocupadas: " + ocupada + "\n" : sala == 1 ? "Livre: " + livre1 + " Reservadas: " + reservada1 + " Ocupadas: " + ocupada1 + "\n" : "Livre: " + livre2 + " Reservadas: " + reservada2 + " Ocupadas: " + ocupada2 + "\n");
                    JOptionPane.showMessageDialog(null, mapa4);

                    coluna = JOptionPane.showInputDialog("Digite qual coluna você quer(A-L):").charAt(0);
                    colunaint = Character.toUpperCase(coluna) - 64;
                    if (colunaint > 12 || colunaint < 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Letra invalida(A-L)\n");
                        break;
                    }

                    linha = Integer.parseInt(JOptionPane.showInputDialog("Digite qual linha voce quer(1-12):"));
                    colunaint = colunaint - 1;
                    linha = linha - 1;
                    if (linha < 0 || linha > 12) {
                        JOptionPane.showMessageDialog(null, "Erro: Numero invalido(1-12)\n");
                        break;
                    }
                    if (bancos[sala][linha][colunaint].equals("[R]")) {
                        JOptionPane.showMessageDialog(null, "Cancelamento feito com sucesso.\n");
                        bancos[sala][linha][colunaint] = "[ ]";
                        if (sala == 0) {
                            reservada = reservada - 1;
                            livre = livre + 1;
                            saldoreserva = saldoreserva - 50;
                        } else if (sala == 1) {
                            reservada1 = reservada1 - 1;
                            livre1 = livre1 + 1;
                            saldoreserva1 = saldoreserva1 - 50;
                        } else if (sala == 2) {
                            reservada2 = reservada2 - 1;
                            livre2 = livre2 + 1;
                            saldoreserva2 = saldoreserva2 - 50;
                        }
                        break;
                    }

                    if (bancos[sala][linha][colunaint].equals("[X]")) {
                        JOptionPane.showMessageDialog(null, "Erro: Voce nao cancelar a reserva de uma cadeira ja comprada[X].\n");
                        break;
                    }

                    JOptionPane.showMessageDialog(null, "Erro: Cadeira vazia.\n");
                    break;

                case 5:
                    sala = Integer.parseInt(JOptionPane.showInputDialog("COMPRAR CADEIRA\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\nEscolha a sala:"));
                    sala = sala - 1;

                    String mapa5 = "";
                    for (i = 0; i < letras.length; i++) {
                        mapa5 += letras[i];
                    }
                    mapa5 += "\n";
                    for (i = 0; i < 12; i++) {
                        mapa5 += numeros[i] + " ";
                        for (c = 0; c < 12; c++) {
                            mapa5 += bancos[sala][i][c];
                        }
                        mapa5 += "\n";
                    }
                    mapa5 += (sala == 0 ? "Livre: " + livre + " Reservadas: " + reservada + " Ocupadas: " + ocupada + "\n" : sala == 1 ? "Livre: " + livre1 + " Reservadas: " + reservada1 + " Ocupadas: " + ocupada1 + "\n" : "Livre: " + livre2 + " Reservadas: " + reservada2 + " Ocupadas: " + ocupada2 + "\n");
                    JOptionPane.showMessageDialog(null, mapa5);

                    coluna = JOptionPane.showInputDialog("Digite qual coluna você quer(A-L):").charAt(0);
                    colunaint = Character.toUpperCase(coluna) - 64;
                    if (colunaint > 12 || colunaint < 1) {
                        JOptionPane.showMessageDialog(null, "Erro: Letra invalida(A-L)\n");
                        break;
                    }

                    linha = Integer.parseInt(JOptionPane.showInputDialog("Digite qual linha quer(1-12):"));
                    colunaint = colunaint - 1;
                    linha = linha - 1;
                    if (linha < 0 || linha > 12) {
                        JOptionPane.showMessageDialog(null, "Erro: Numero invalido(1-12)\n");
                        break;
                    }
                    if (bancos[sala][linha][colunaint].equals("[R]")) {
                        bancos[sala][linha][colunaint] = "[X]";
                        if (sala == 0) {
                            saldoreserva = saldoreserva - 50;
                            reservada = reservada - 1;
                            ocupada = ocupada + 1;
                            saldo = saldo + 100;
                        } else if (sala == 1) {
                            saldoreserva1 = saldoreserva1 - 50;
                            reservada1 = reservada1 - 1;
                            ocupada1 = ocupada1 + 1;
                            saldo1 = saldo1 + 100;
                        } else if (sala == 2) {
                            saldoreserva2 = saldoreserva2 - 50;
                            reservada2 = reservada2 - 1;
                            ocupada2 = ocupada2 + 1;
                            saldo2 = saldo2 + 100;
                        }
                        break;
                    } else {
                        if (sala == 0) {
                            ocupada = ocupada + 1;
                            saldo = saldo + 100;
                        } else if (sala == 1) {
                            ocupada1 = ocupada1 + 1;
                            saldo1 = saldo1 + 100;
                        } else if (sala == 2) {
                            ocupada2 = ocupada2 + 1;
                            saldo2 = saldo2 + 100;
                        }
                    }
                    bancos[sala][linha][colunaint] = "[X]";
                    if (sala == 0) {
                        livre = livre - 1;
                    }
                    if (sala == 1) {
                        livre1 = livre1 - 1;
                    }
                    if (sala == 2) {
                        livre2 = livre2 - 1;
                    }
                    break;

                case 6:
                    sala = Integer.parseInt(JOptionPane.showInputDialog("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\nEscolha a sala:"));
                    sala = sala - 1;
                    
                    if (sala == 0) {
                        JOptionPane.showMessageDialog(null, "RELATORIO FINANCEIRO\n"
                                + "Cadeiras livres: " + livre + "\n"
                                + "Cadeiras reservadas: " + reservada + "\n"
                                + "Cadeiras ocupadas: " + ocupada + "\n"
                                + "Total arrecadado(pagos): " + saldo + "\n"
                                + "Total arrecadado(reservados): " + saldoreserva + "\n"
                                + "Potencial de vendas(livres): " + (livre * 100) + "\n"
                                + "Potencial de vendas(reservados): " + (saldoreserva * 2));
                    } else if (sala == 1) {
                        JOptionPane.showMessageDialog(null, "RELATORIO FINANCEIRO\n"
                                + "Cadeiras livres: " + livre1 + "\n"
                                + "Cadeiras reservadas: " + reservada1 + "\n"
                                + "Cadeiras ocupadas: " + ocupada1 + "\n"
                                + "Total arrecadado(pagos): " + saldo1 + "\n"
                                + "Total arrecadado(reservados): " + saldoreserva1 + "\n"
                                + "Potencial de vendas(livres): " + (livre1 * 100) + "\n"
                                + "Potencial de vendas(reservados): " + (saldoreserva1 * 2));
                    } else if (sala == 2) {
                        JOptionPane.showMessageDialog(null, "RELATORIO FINANCEIRO\n"
                                + "Cadeiras livres: " + livre2 + "\n"
                                + "Cadeiras reservadas: " + reservada2 + "\n"
                                + "Cadeiras ocupadas: " + ocupada2 + "\n"
                                + "Total arrecadado(pagos): " + saldo2 + "\n"
                                + "Total arrecadado(reservados): " + saldoreserva2 + "\n"
                                + "Potencial de vendas(livres): " + (livre2 * 100) + "\n"
                                + "Potencial de vendas(reservados): " + (saldoreserva2 * 2));
                    }
                    break;
            }
        } while (opcao != 7);
    }
}
