package Java3;

import java.util.Scanner;

public class exercicio3 {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Insira o código do seu pacote, sendo eles:\n[1]Pacote\n[2]Conteiner\n[3]Caixa\n");
        int codigo = sc.nextInt();

        if (codigo == 1){
            System.out.println("Opção selecionada: Pacote\nNome do seu produto: ");
            String nome = sc.next();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            System.out.println("Para onde será destinado: ");
            String destino = sc.next();
            System.out.println("Valor unitário: ");
            double vunit = sc.nextDouble();
            double vtotal = quantidade*vunit;
            System.out.printf("INFORMAÇÕES GERAIS DO SEU PRODUTO\n NOME: %s\n QUANTIDADE: %d\n DESTINO: %s\n VALOR UNITÁRIO: %.2f\n VALOR TOTAL %.2f\n enviado para a área.", nome, quantidade, destino, vunit, vtotal);

        }else if (codigo == 2){
            System.out.println("Opção selecionada: Conteiner\nNome do seu produto: ");
            String nome = sc.next();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            System.out.println("Para onde será destinado: ");
            String destino = sc.next();
            System.out.println("Valor unitário: ");
            double vunit = sc.nextDouble();
            double vtotal = quantidade*vunit;
            System.out.printf("INFORMAÇÕES GERAIS DO SEU PRODUTO\n NOME: %s\n QUANTIDADE: %d\n DESTINO: %s\n VALOR UNITÁRIO: %.2f\n VALOR TOTAL %.2f\n enviado para a área.", nome, quantidade, destino, vunit, vtotal);

        }else if (codigo == 3){
            System.out.println("Opção selecionada: Caixa\nNome do seu produto: ");
            String nome = sc.next();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            System.out.println("Para onde será destinado: ");
            String destino = sc.next();
            System.out.println("Valor unitário: ");
            double vunit = sc.nextDouble();
            double vtotal = quantidade*vunit;
            System.out.printf("INFORMAÇÕES GERAIS DO SEU PRODUTO\n NOME: %s\n QUANTIDADE: %d\n DESTINO: %s\n VALOR UNITÁRIO: %.2f\n VALOR TOTAL %.2f\n enviado para a área.", nome, quantidade, destino, vunit, vtotal);

        }




    }
}
