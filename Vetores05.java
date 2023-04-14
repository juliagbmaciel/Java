import java.util.Scanner;
import java.util.Arrays;
public class ex_03 {
    public static void main (String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho dos dois vetores: ");
        int tamanho = sc.nextInt();

        int[] vetorUm = new int[tamanho];
        int[] vetorDois = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.printf("Digite o valor da posição %d do primeiro vetor: ", i);
            vetorUm[i] = sc.nextInt();
        }
        System.out.println("\n!!!!!Próximo vetor!!!!\n");
        for (int j = 0; j < tamanho; j++){
            System.out.printf("Digite o valor da posição %d do segundo vetor: ", j);
            vetorDois[j] = sc.nextInt();
        }
        System.out.println("Vetor um: " + Arrays.toString(vetorUm));
        System.out.println("Vetor dois: " + Arrays.toString(vetorDois));

        for(int y = 0; y < tamanho; y++){
            int soma = vetorUm[y] + vetorDois[y];
            System.out.printf("A soma dos valores na posição %d é de: %d \n", y, soma);
        }


    }
}
