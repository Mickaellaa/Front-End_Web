import java.io.Console;
import java.util.*;

public class Imprima {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Npar = 0;
        int Nimpar = 1;
        int num = 1;
        int numA;

        System.out.println("===== Imprima os números pares e impar =====");

        while (num <= 10){
            System.out.println("Digite um número: ");
            numA = entrada.nextInt();
            num ++;

            if(numA % 2 == 0)
                Npar = Npar + 1;
            if(numA % 2 == 1)
                Nimpar = Nimpar + 1;
        }
        System.out.println("A qtd de números pares é: " + Npar);
        System.out.println("A qtd de números impar é: " + Nimpar);
        entrada.close();
    }
}