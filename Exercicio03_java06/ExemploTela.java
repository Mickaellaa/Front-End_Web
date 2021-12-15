import java.util.Scanner; //Importando o Scanner para receber a entrada da variável
public class ExemploTela {
    public static void main(String[ ] args) {
        Scanner entrada = new Scanner(System.in); //Inicio entrada
        int num, cont;
        System.out.println("Informe um número: ");
        num = entrada.nextInt();

        for(cont = 1; cont <= num; cont++)
            System.out.print(cont + " ");
    }
}