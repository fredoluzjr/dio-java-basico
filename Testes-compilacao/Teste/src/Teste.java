import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome, cidade;
        int idade;
        String estado;

        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Idade: ");
        idade = scan.nextInt();
        System.out.println("Cidade: ");
        cidade = scan.next();
        System.out.println("Estado: ");
        estado = scan.next();

        /*nome = "Alfredo";
        idade = 29;
        cidade = "Curitiba";
        estado = "Paraná";*/

        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Sou de " + cidade);
        System.out.println("Do estado do " + estado);
    }
}
