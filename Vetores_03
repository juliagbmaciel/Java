import java.util.Scanner;
import java.util.Arrays;
public class ex_01 {
    public static void main (String[] Args){

        double somaMedia = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho do vetor em que deseja armazenar os valores: ");
        int tamanho = sc.nextInt();

        int[] Vetor = new int [tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.printf("Insira o %d valor: ", i+1);
            Vetor[i] = sc.nextInt();
            somaMedia += Vetor[i];
        }
        System.out.println("Vetor: " + Arrays.toString(Vetor));
        System.out.printf("A média dos valores digitados é %.2f ", somaMedia/tamanho);
    }


}
