import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        System.out.println("==== Verificador de senha ====");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = entrada.next();

        if(senha.equals("123@456")){ //Para comparar duas Strings utilizar o método equals();
            System.out.println("Senha correta");
        }
        else{
            System.out.println("Verifique sua senha!");
        }
        entrada.close();
    }
}