import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o ano atual: ");
        int anoAtual = entrada.nextInt();
        System.out.print("Insira a sua idade: ");
        int idade = entrada.nextInt();

        int anoNasc = anoAtual - idade;
        System.out.println("O seu ano de nascimento é: " + anoNasc);

        entrada.close();
    }
}