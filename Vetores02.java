import java.util.Arrays;
import java.util.Random;


public class avancado_02 {
    public static void main(String[] Args) {
        Random gerador = new Random();
        int tamanho = gerador.nextInt(101);
        System.out.println("Tamanho: " + tamanho);
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = gerador.nextInt(101);
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));

        int posInicial = 0;
        int posFinal = 0;
        int maiorSequencia = 0;
        int sequenciaAtual = 1;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] == vetor[i - 1]) {
                sequenciaAtual++;
            } else {
                if (sequenciaAtual > maiorSequencia) {
                    maiorSequencia = sequenciaAtual;
                    posInicial = i - sequenciaAtual;
                    posFinal = i - 1;
                }
                sequenciaAtual = 1;
            }
        }

        if (sequenciaAtual > maiorSequencia) {
            maiorSequencia = sequenciaAtual;
            posInicial = vetor.length - sequenciaAtual;
            posFinal = vetor.length - 1;
        }

        System.out.println("Maior sequência de valores consecutivos iguais: " + maiorSequencia);
        System.out.println("Posição inicial: " + posInicial);
        System.out.println("Posição final: " + posFinal);

    }
}
