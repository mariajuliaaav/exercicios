import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int n;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o número: ");
        n = entrada.nextInt();
        System.out.println("O numero é: " + n);
        n = n - 1;
        System.out.println("O antecessor é: " + n);
        n = n + 2;
        System.out.println("O sucessor é: " + n);

        entrada.close();
    }
}