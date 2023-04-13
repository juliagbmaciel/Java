import java.util.Random;
import java.util.Arrays;

public class ex_02 {
    public static void main (String[] Args){
        Random gerador = new Random();
        int tamanho = gerador.nextInt(101);
        System.out.println("Tamanho: " + tamanho);
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            vetor[i] = gerador.nextInt(101);
        }
        int min = vetor[0];
        int max = vetor[0];
        for (int j = 1; j < tamanho; j++){
            if (vetor[j] < min){
                min = vetor[j];
            } else if (vetor[j] > max) {
                max = vetor[j];
            }
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.printf("Valor máximo dentro do vetor: %d\n", max);
        System.out.printf("Valor mínimo dentro do vetor: %d\n", min);

    }
}
