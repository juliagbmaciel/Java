import java.util.Scanner;
import java.util.Random;


public class jogo {
    public static void main (String[] Args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int linhaUsuario = 0;
        int colunaUsuario = 0;
        String op;


        while(true) {
            System.out.println(" *" + "-".repeat(21) + "*");
            System.out.println(" |\033[35m  Find the Treasure \033[0m |");
            System.out.println(" *" + "-".repeat(21) + "*" + "\n");
            Object[][] matriz = new Object[5][5];
            String[][] amostra = new String[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    matriz[i][j] = rand.nextInt(0, 9);
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    amostra[i][j] = "_ ";
                }
            }

            MostraAmostraVazia(amostra);
            int coluna = rand.nextInt(0, 4);
            int linha = rand.nextInt(0, 4);
            matriz[linha][coluna] = "X";

            for (int i = 0; i < 3; i++) {
                System.out.println("\n\rDigite um número de 1 a 5 para verificar a coluna: ");
                colunaUsuario = sc.nextInt();
                System.out.println("\n\rDigite um número de 1 a 5 para verificar a linha: ");
                linhaUsuario = sc.nextInt();
                MostraAmostraUsuario(linhaUsuario, colunaUsuario, amostra);
                if (matriz[linhaUsuario - 1][colunaUsuario - 1] == "X") {
                    System.out.println("\33[34m\n ▀█ █▀ █▀▀█ █▀▀ █▀▀    ▀█ █▀ █▀▀ █▀▀▄ █▀▀ █▀▀ █  █");
                    System.out.println("  █▄█  █  █ █   █▀▀     █▄█  █▀▀ █  █ █   █▀▀ █  █");
                    System.out.println("   ▀   ▀▀▀▀ ▀▀▀ ▀▀▀      ▀   ▀▀▀ ▀  ▀ ▀▀▀ ▀▀▀ ▀▀▀\33[0m");
                    System.out.println("\nParabéns, você encontrou o tesouro!!!!");
                    System.out.println("A matriz em questão era:");
                    MostraMatriz(matriz);
                    break;
                } else {
                    System.out.println("\nInfelizmente o tesouro não está na posição indicada");
                }
            }
            if (!(matriz[linhaUsuario - 1][colunaUsuario - 1]).equals("X")) {
                System.out.println("\33[31m █▀▀▀ █▀▀█ █▀▄▀█ █▀▀   █▀▀█ ▀█ █▀ █▀▀ █▀▀█");
                System.out.println("\33[31m █ ▀█ █▄▄█ █ ▀ █ █▀▀   █  █  █▄█  █▀▀ █▄▄▀");
                System.out.println("\33[31m ▀▀▀▀ ▀  ▀ ▀   ▀ ▀▀▀   ▀▀▀▀   ▀   ▀▀▀ ▀ ▀▀\33[0m");

                System.out.println("A matriz em questão era: ");
                MostraMatriz(matriz);
            }
            System.out.println("Deseja tentar novamente?\n[SIM OU NAO]");
            op = sc.next().toUpperCase();
            if (op.equals("SIM")) {
                System.out.println(" ");
            } else if (op.equals("NAO")) {
                break;
            }
        }
    }

    public static void MostraAmostraUsuario(int linhaUsuario, int colunaUsuario, String[][] amostra) {
        amostra[linhaUsuario - 1][colunaUsuario - 1] = "X ";
        System.out.println("\033[33m  1  2  3  4  5 \033[0m");
        for (int i = 0; i < 5; i++){
            System.out.print(i+1 + " ");
            for (int j = 0; j < amostra[i].length; j++) {
                System.out.print(amostra[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void MostraAmostraVazia(String[][] amostra){
        System.out.println("\033[35m  1  2  3  4  5 \033[0m");
        for (int i = 0; i < amostra.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < amostra[i].length; j++) {
                System.out.printf(amostra[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void MostraMatriz(Object[][] Matriz) {
        for (Object[] objects : Matriz) {
            for (Object object : objects) {
                System.out.print(object + " ");
            }
            System.out.println(" ");
        }
    }
}




