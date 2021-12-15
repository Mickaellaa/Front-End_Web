import java.util.Scanner; // Import necessário para utilizar a classe
public class LerNumero {
    public static void main(String[] args) {

        System.out.println(" === Ler um n° e imprima a sequência de n° que vai do 1 ao n° lido ===");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        int i;

        System.out.println("Sequência ");
        for (i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        entrada.close();
    }
}