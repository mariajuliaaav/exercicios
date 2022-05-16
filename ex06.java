import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a temperatura em graus Celsius: ");
        double C = entrada.nextInt();
        double F = C * (9.0 / 5.0) + 32.0;

        System.out.println(C + "°C resulta em " + F + "°F.");

        entrada.close();
    }
}