import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira quantos dólares serão convertidos: ");
        double dolar = entrada.nextDouble();

        double valor = dolar * 5.06;
        System.out.println(dolar + "$ daria " + valor + "R$.");

        entrada.close();
    }
}