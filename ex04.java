import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a velocidade em km/h: ");
        double K = entrada.nextInt();
        double M = K / 3.6;

        System.out.println(K + " em km/h resulta em " + M + " em m/s.");

        entrada.close();
    }
}