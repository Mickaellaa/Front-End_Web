import java.util.Scanner;

public class Leia {
    public static void main(String[] args){
        System.out.println("===== Calculando IMC =====");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = entrada.nextFloat();
        System.out.println("=====  Qual seu sexo: =====");
        System.out.println(" 1 para Feminino");
        System.out.println(" 2 para Masculino");
        System.out.println("===== Escolha uma opção =====");
        int sex = entrada.nextInt();// Ler a opção escolhida

        switch (sex) {
            case 1:
                double pesoF = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal é:  " + pesoF);
                break;
            case 2:
                double pesoM = (72.7 * altura) - 58;
                System.out.println("Seu peso ideal é:  " + pesoM);
                break;
            default:
                System.out.println("Operação não disponível ou inválida!");
        }
        entrada.close();
    }
}
