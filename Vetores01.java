import java.util.Scanner;

public class avancado_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        int[] pares = new int[tamanho];
        int[] impares = new int[tamanho];

        int posPares = 0;
        int posImpares = 0;
        for (int j : vetor) {
            if (j % 2 == 0) {
                pares[posPares] = j;
                posPares++;
            } else {
                impares[posImpares] = j;
                posImpares++;
            }
        }

        System.out.print("Valores pares: ");
        for (int i = 0; i < posPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.print("Valores ímpares: ");
        for (int i = 0; i < posImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
