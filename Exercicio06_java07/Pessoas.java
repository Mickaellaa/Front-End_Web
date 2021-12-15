import java.util.Scanner; // Importando o Scanner para a entrada de dados

public class Pessoas {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int i , idade, quantdIdade = 0;
        float altura, peso, mediaAltura = 0, quatdAltura = 0, quatdPeso = 0;

        for(i = 0; i <= 10 ; i++){
            System.out.print("Digite sua Idade: ");
            idade = entrada.nextInt();
            System.out.print("Digite sua Altura: ");
            altura = entrada.nextFloat();
            System.out.print("Digite seu Peso: ");
            peso = entrada.nextFloat();

            if(idade > 50){
                quantdIdade++;
            } else if (altura >=10 && altura <= 20){
                quatdAltura++;
                mediaAltura+=altura;
            } else {
                quatdPeso++;
            }
            System.out.println("A quantidade de pessoas com idade superior a 50 anos: " + quantdIdade);
            System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: " + (mediaAltura / quatdAltura));
            System.out.println("A percentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisada: " + (quatdPeso / 100));
        }
        entrada.close(); //Fim entrada
    }
}