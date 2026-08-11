import java.util.Scanner;

public class Teatro{
    public static void lista(String[]titulos){
            System.out.printf("------------------------------------\n");
            System.out.printf("          MENU DE EXERCICIOS        \n");
            System.out.printf("------------------------------------\n");
        System.out.printf("Pagina 1\n");
            for(int i = 0; i < 7; i ++){
                System.out.println(titulos[i]);
            }
            System.out.printf("\n");
}

public static void lista2(String[]titulos){
    System.out.printf("------------------------------------\n");
    System.out.printf("          MENU DE EXERCICIOS        \n");
    System.out.printf("------------------------------------\n");
        System.out.printf("Pagina 2\n");
            for(int i = 7; i < 15; i ++){
                System.out.println(titulos[i]);
            }
            System.out.printf("\n");
}

public static void lista3(String[]titulos){
    System.out.printf("------------------------------------\n");
    System.out.printf("          MENU DE EXERCICIOS        \n");
    System.out.printf("------------------------------------\n");
        System.out.printf("Pagina 3\n");
            for(int i = 15; i < 20; i ++){
                System.out.println(titulos[i]);
            }
            System.out.printf("\n");
}

    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String exer;
        char coluna;
        int opcao, g, i, c, sala, linha, livre = 144, colunaint = 0, reservada = 0, ocupada = 0, saldo = 0, saldoreserva = 0;
        int livre1 = 144, reservada1 = 0, ocupada1 = 0, saldo1 = 0, saldoreserva1 = 0;
        int livre2 = 144 ,reservada2 = 0, ocupada2 = 0, saldo2 = 0, saldoreserva2 = 0;
        String[] letras = {"    A", "  B", "  C ", " D", "  E", "  F", "  G", "  H", "  I", "  J", "  K", "  L"};
        String[] numeros = {"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "11", "12"};

        String[][][] bancos = new String[3][12][12];

        
        // Declarando na Matriz
        for(g = 0; g < 3; g++){
            for(i = 0; i < 12; i++){
                for(c = 0; c < 12; c++){
                    bancos[g][i][c] = "[ ]";
                }
            }
        }
        

        do{
        System.out.printf("------------------------------------\n");
        System.out.printf("          TEATRO DEVISATE           \n");
        System.out.printf("------------------------------------\n");
        System.out.printf("1 - Listar Salas\n");
        System.out.printf("2 - Exibir Mapa da Sala\n");
        System.out.printf("3 - Reservar Cadeira\n");
        System.out.printf("4 - Cancelar Reserva de uma Cadeira\n");
        System.out.printf("5 - Comprar Cadeira\n");
        System.out.printf("6 - Relatório Financeiro\n");
        System.out.printf("7 - Lista de Exercícios\n");
        System.out.printf("8 - Sair\n");
        System.out.printf("Digite sua opção: ");
        opcao = ler.nextInt();
        System.out.printf("\n");
        ler.nextLine();

            switch(opcao){
            case 8:
                System.out.printf("Obrigado por usar nosso programa!\n");
                break;
            case 1:
                System.out.println("LISTA DE SALAS");
                System.out.printf("\n");
                System.out.printf("\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                break;
            case 2:
                System.out.println("MAPA DAS SALA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                System.out.printf("\n");
                if(sala>3 || sala<1){
                    System.out.println("Erro: Sala Inexistente.\n");
                    break;
                }

                if(sala == 1){
                    sala = sala - 1;
                    System.out.println("Espetaculo: A queda do gato\n");
                    for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");
                }

                else if(sala == 2){
                    sala = sala - 1;
                    System.out.println("Espetaculo: Pocoyo e seus amigos vao para uma aventura\n");
                    for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");
                }

                else if(sala == 3){
                    sala = sala - 1;
                    System.out.println("Espetaculo: Raposo rouba a casa da formiga\n");
                    for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");
                }
                break;

            case 3:
                System.out.println("RESERVAR CADEIRA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");

                for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
                System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");

                
                System.out.printf("Digite qual coluna você quer(A-L): ");
                coluna = ler.next().charAt(0);
                //no ASCII, os computadores interpretam o A como 65
                colunaint = Character.toUpperCase(coluna) - 64;
                if(colunaint > 12 || colunaint < 0){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual linha voce quer(1-12): ");
                linha = ler.nextInt();
                colunaint = colunaint - 1;
                linha = linha - 1;
                if(linha < 0 || linha > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[sala][linha][colunaint].equals("[R]")){
                    System.out.printf("Esta cadeira ja esta reservada[R].\n");
                    break;
                }

                if(bancos[sala][linha][colunaint].equals("[X]")){
                    System.out.printf("Erro: Voce nao pode reservar uma cadeira ja comprada[X].\n");
                    break;
                }

                bancos[sala][linha][colunaint] = "[R]";
                if(sala == 0){
                    reservada = reservada + 1;
                    livre = livre - 1;
                    saldoreserva = saldoreserva + 50;
                }
                else if(sala == 1){
                    reservada1 = reservada1 + 1;
                    livre1 = livre1 - 1;
                    saldoreserva1 = saldoreserva1 + 50;
                }
                else if(sala == 2){
                    reservada2 = reservada2 + 1;
                    livre2 = livre2 - 1;
                    saldoreserva2 = saldoreserva2 + 50;
                }
                break;
            case 4:
                System.out.println("CANCELAR RESERVA CADEIRA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");

                for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
                System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");

                System.out.printf("Digite qual coluna você quer(A-L): ");
                coluna = ler.next().charAt(0);
                //no ASCII, os computadores interpretam o A como 65
                colunaint = Character.toUpperCase(coluna) - 64;
                if(colunaint > 12 || colunaint < 0){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual linha voce quer(1-12): ");
                linha = ler.nextInt();
                colunaint = colunaint - 1;
                linha = linha - 1;
                if(linha < 0 || linha > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[sala][linha][colunaint].equals("[R]")){
                    System.out.printf("Cancelamento feito com sucesso.\n");
                    bancos[sala][linha][colunaint] = "[ ]";
                    break;
                }

                if(bancos[sala][linha][colunaint].equals("[X]")){
                    System.out.printf("Erro: Voce nao cancelar a reserva de uma cadeira ja comprada[X].\n");
                    break;
                }

                System.out.printf("Erro: Cadeira vazia.\n");

                if(sala == 0){
                reservada = reservada + -1;
                livre = livre + 1;
                saldoreserva = saldoreserva - 50;
                }

                else if(sala == 1){
                reservada1 = reservada1 + -1;
                livre1 = livre1 + 1;
                saldoreserva1 = saldoreserva1 - 50;
                }

                else if(sala == 2){
                reservada2 = reservada2 + -1;
                livre2 = livre2 + 1;
                saldoreserva2 = saldoreserva2 - 50;
                }
                break;

            case 5:
                System.out.println("COMPRAR CADEIRA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");

                for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");

            System.out.printf("Digite qual coluna você quer(A-L): ");
                coluna = ler.next().charAt(0);
                colunaint = Character.toUpperCase(coluna) - 64;
                if(colunaint > 12 || colunaint < 1){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual linha quer(1-12): ");
                linha = ler.nextInt();
                colunaint = colunaint - 1;
                linha = linha - 1;
                if(linha < 0 || linha > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[sala][linha][colunaint].equals("[R]")){
                    bancos[sala][linha][colunaint] = "[X]";
                    if(sala==0){
                    saldoreserva = saldoreserva - 50;
                    reservada = reservada - 1;
                    ocupada = ocupada + 1;
                    saldo = saldo + 100;
                    }
                    else if(sala==1){
                        saldoreserva1 = saldoreserva1 - 50;
                        reservada1 = reservada1 - 1;
                        ocupada1 = ocupada1 + 1;
                        saldo1 = saldo1 + 100;
                    }
                    else if(sala==2){
                        saldoreserva2 = saldoreserva2 - 50;
                        reservada2 = reservada2 - 1;
                        ocupada2 = ocupada2 + 1;
                        saldo2 = saldo2 + 100;
                    }
                    break;
                }
                else{
                    if(sala==0){
                        ocupada = ocupada + 1;
                        saldo = saldo + 100;
                    }
                    else if(sala==1){
                        ocupada1 = ocupada1 + 1;
                        saldo1 = saldo1 + 100;
                    }
                    else if(sala==2){
                        ocupada2 = ocupada2 + 1;
                        saldo2 = saldo2 + 100;
                    }
                }
                bancos[sala][linha][colunaint] = "[X]";
                if(sala == 0){
                livre = livre - 1;
                }
                if(sala == 1){
                livre1 = livre1 - 1;
                }
                if(sala == 2){
                livre2 = livre2 - 1;
                }
                break;

            case 6:
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");
                if(sala==0){
                System.out.println("RELATORIO FINANCEIRO");
                System.out.println("Cadeiras livres: "+livre);
                System.out.println("Cadeiras reservadas: "+reservada);
                System.out.println("Cadeiras ocupadas: "+ocupada);
                System.out.println("Total arrecadado(pagos): "+saldo);
                System.out.println("Total arrecadado(reservados): "+saldoreserva);
                System.out.println("Potencial de vendas(livres): "+livre*100);
                System.out.println("Potencial de vendas(reservados): "+saldoreserva*2);
                }
                else if(sala==1){
                System.out.println("RELATORIO FINANCEIRO");
                System.out.println("Cadeiras livres: "+livre1);
                System.out.println("Cadeiras reservadas: "+reservada1);
                System.out.println("Cadeiras ocupadas: "+ocupada1);
                System.out.println("Total arrecadado(pagos): "+saldo1);
                System.out.println("Total arrecadado(reservados): "+saldoreserva1);
                System.out.println("Potencial de vendas(livres): "+livre1*100);
                System.out.println("Potencial de vendas(reservados): "+saldoreserva1*2);
                }
                if(sala==2){
                System.out.println("RELATORIO FINANCEIRO");
                System.out.println("Cadeiras livres: "+livre2);
                System.out.println("Cadeiras reservadas: "+reservada2);
                System.out.println("Cadeiras ocupadas: "+ocupada2);
                System.out.println("Total arrecadado(pagos): "+saldo2);
                System.out.println("Total arrecadado(reservados): "+saldoreserva2);
                System.out.println("Potencial de vendas(livres): "+livre2*100);
                System.out.println("Potencial de vendas(reservados): "+saldoreserva2*2);
                }
                break;
            case 7:
                String[] titulos = {"1 - Par ou Ímpar", "2 - Maior de Dois Números", "3 - Aprovação Escolar", "4 - Classificação de Temperatura", "5 - Calculadora Simples com Switch", "6 - Ano Bissexto", "7 - Triângulo Válido", "8 - IMC", "9 - Dia da Semana com Switch", "10 - Positivo, Negativo ou Zero", "11 - Ingresso de Cinema", "12 - Nota por Conceito", "13 - Estação do Ano com Switch", "14 - Maior de Três Números", "15 - Verificador de Login", "16 - Múltiplo de 3 e 5", "17 - Desconto em Compra", "18 - Número Romano com Switch", "19 - Velocidade e Multa", "20 - Jogo Pedra, Papel e Tesoura"};
                String[] enunciados = {
                    "Leia um número inteiro e informe se ele é par ou ímpar. \nObrigatório: use o operador ternário para exibir a mensagem.",
                    "Leia dois números inteiros e exiba qual é o maior. \nObrigatório: use o operador ternário para determinar e exibir o maior.",
                    "Leia a média de um aluno (0 a 10) e exiba:\nAprovado se média >= 7\nRecuperação se média >= 5 e < 7\nReprovado se média < 5",
                    "Leia a temperatura em graus Celsius e classifique:\nAbaixo de 15°C → Frio\nEntre 15°C e 25°C → Agradável\nAcima de 25°C → Quente\nDesafio: tente usar o ternário aninhado para classificar.",
                    "Leia dois números e um operador (+, -, *, /) e realize a operação correspondente usando switch.\n Trate a divisão por zero.",
                    "Leia um ano e informe se ele é bissexto ou não.\nUm ano é bissexto se divisível por 4, exceto centenários, salvo os divisíveis por 400.",
                    "Leia três lados e verifique se formam um triângulo válido.\n Se sim, classifique como equilátero, isósceles ou escaleno.",
                    "Leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique:\nIMC < 18.5 → Abaixo do peso\n18.5 ≤ IMC < 25 → Peso normal\n25 ≤ IMC < 30 → Sobrepeso\nIMC ≥ 30 → Obesidade\nDesafio: use o ternário para exibir se o IMC está dentro ou fora da faixa saudável.",
                    "Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch.\n Para qualquer outro número, exiba Dia inválido.",
                    "Leia um número e informe se é positivo, negativo ou zero. \nObrigatório: use o operador ternário aninhado.",
                    "Uma sala de cinema cobra:\nMenores de 12 anos: R$ 10,00\nEntre 12 e 60 anos: R$ 20,00\nAcima de 60 anos: R$ 10,00 (meia)\nLeia a idade e exiba o valor do ingresso.",
                    "Leia uma nota (0-10) e exiba o conceito:\n9 a 10 → A\n7 a 8 → B\n5 a 6 → C\n0 a 4 → D",
                    "Leia o número do mês (1-12) e exiba a estação do ano correspondente \n(considere o hemisfério sul).",
                    "Leia três números inteiros e exiba qual é o maior entre os três. \nTrate o caso de empate.",
                    "Defina um usuário e senha fixos no código. \nLeia o usuário e a senha digitados e exiba Acesso permitido ou Acesso negado. \nObrigatório: use o operador ternário para exibir a mensagem.",
                    "Leia um número inteiro e informe:\nSe é múltiplo de 3 e de 5 simultaneamente\nSe é múltiplo apenas de 3\nSe é múltiplo apenas de 5\nSe não é múltiplo de nenhum\nDesafio: use o ternário onde for possível.",
                    "Uma loja dá desconto conforme o valor da compra:\nAcima de R$ 500 → 20% de desconto\nEntre R$ 200 e R$ 500 → 10% de desconto\nAbaixo de R$ 200 → sem desconto\nLeia o valor e exiba o valor final após o desconto.",
                    "Leia um número de 1 a 10 e exiba seu equivalente em algarismo romano usando switch.",
                    "Leia a velocidade de um veículo e o limite da via. Classifique:\nDentro do limite → Sem multa\nAté 20% acima → Multa leve\nEntre 20% e 50% acima → Multa grave\nAcima de 50% → Multa gravíssima + suspensão",
                    "Leia a escolha de dois jogadores (pedra, papel ou tesoura) e determine quem venceu ou se houve empate usando if/else encadeado. \nDesafio: use o operador ternário para exibir o resultado final (Jogador 1 venceu, Jogador 2 venceu ou Empate)."
                };
                do{
                System.out.printf("\n");
                lista(titulos);
                System.out.printf("Proxima pagina(P)\nVoltar para o menu(X)\nEscolha sua opcao: ");
                exer = ler.nextLine();
                System.out.printf("\n");
                if(exer.equalsIgnoreCase("X")){
                    System.out.printf("Voltando para o menu.\n");
                    break;
                }
                if(exer.equalsIgnoreCase("P")){
                        do{
                            System.out.printf("\n");
                            lista2(titulos);
                            System.out.printf("Proxima pagina(P)\nPagina anterior(A)\nVoltar para o menu(X)\nEscolha sua opcao: ");
                            exer = ler.nextLine();
                            System.out.printf("\n");
                            if(exer.equalsIgnoreCase("X")){
                    System.out.printf("Voltando para o menu.\n");
                    break;
                }
                if(exer.equalsIgnoreCase("A")){
                    break;
                }
                if(exer.equalsIgnoreCase("P")){
                                do{
                                    System.out.printf("\n");
                                    lista3(titulos);
                                    System.out.printf("Pagina anterior(A)\nVoltar para o menu(X)\nEscolha sua opcao: ");
                            exer = ler.nextLine();
                            System.out.printf("\n");
                            if(exer.equalsIgnoreCase("A")){
                                break;
                            }
                            if(exer.equalsIgnoreCase("X")){
                    System.out.printf("Voltando para o menu.\n");
                    break;
                                }
                                else{
                    int num = Integer.parseInt(exer);
                    if(num > 20 || num < 16){
                        System.out.printf("Erro: exercicio inexistente.\n");
                        continue;
                    }
                    int indice = num - 1;
                    System.out.println(enunciados[indice]);
                }
                            }while(!exer.equalsIgnoreCase("X"));
                        }
                else{
                    int num = Integer.parseInt(exer);
                    if(num > 15 || num < 8){
                        System.out.printf("Erro: exercicio inexistente.\n");
                        continue;
                    }
                    int indice = num - 1;
                    System.out.println(enunciados[indice]);
                }
                }while(!exer.equalsIgnoreCase("X"));
                }
                else{
                    int num = Integer.parseInt(exer);
                    if(num > 7 || num < 1){
                        System.out.printf("Erro: exercicio inexistente.\n");
                        continue;
                    }
                    int indice = num - 1;
                    System.out.println(enunciados[indice]);
                }
                }while(!exer.equalsIgnoreCase("X"));
        }
        }while(opcao!=8);
    }
}