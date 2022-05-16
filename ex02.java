import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2 = entrada.nextInt();
        System.out.print("Insira o terceiro número: ");
        int n3 = entrada.nextInt();

        int soma = n1 + n2 + n3;
        System.out.println("O resultado da soma é: " + soma);

        entrada.close();
    }
}