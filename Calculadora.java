package Java3;

import java.util.Scanner;
public class Example {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number");
        int n1 = sc.nextInt();
        System.out.println("Input another number");
        int n2 = sc.nextInt();

        int resultSum = n1 + n2;
        int resultSub = n1 - n2;
        int resultMult = n1 * n2;
        int resultDivision =  n1 / n2;
        int resultMod = n1 % n2;
        double resultPow = Math.pow(n1,n2);

        System.out.println("The result of sum is "+resultSum);
        System.out.println("The result of sub is "+resultSub);
        System.out.println("The result of multiply is "+resultMult);
        System.out.println("The result of division is "+resultDivision);
        System.out.println("The result of mod is "+resultMod);
        System.out.println("The result of pow is "+resultPow);




    }

}
