import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        System.out.println("==== Faça um programa que receba uma string digitada pelo usuário e retorne ====");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.next();
        String[] letrasEncontradas;
        int contador = 0;

        //Tamanho da string
        System.out.println("O tamanho da Frase é: " + frase.length());

        for (int i = 0; i < frase.length(); i++) {
            for(int j = 0; j < frase.length(); j++)
                if(frase.charAt(j) == frase.charAt(i)){
                    contador++;
                }
        }
        // ao imprimir as frequências, exclui a contagem dos espaços
        char c = frase.charAt(i);
        if (c != ' ' && !letrasEncontradas.contains("" + c)) {
            letrasEncontradas = letrasEncontradas + c;
            System.out.println("A letra "+s.charAt(i)+" aparece "+cont+" vezes.");
        }
        contador = 0;
        entrada.close();
    }
}