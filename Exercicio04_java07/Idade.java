import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        System.out.println(" === Faça um algoritmo que receba a idade e a altura de 10 pessoas ===");
        Scanner entrada = new Scanner(System.in);
        int idade;
        int i = 1;
        float altura;

        for(i = 0; i <= 10; i++){
            System.out.println("Digite uma idade: ");
            idade = entrada.nextInt();
            System.out.println("Digite uma altura: ");
            altura = entrada.nextInt();
            if (idade >= 50){
                double media = altura / i;
                System.out.println("A média é: " + media);
            }
        }
        entrada.close();
    }
}
