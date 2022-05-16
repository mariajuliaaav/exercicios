import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        int total = 780000;
        double primeiro = total * 0.46;
        double segundo = total * 0.32;
        double terceiro = total - (primeiro + segundo);

        System.out.println("1° lugar: R$" + primeiro);
        System.out.println("2° lugar: R$" + segundo);
        System.out.println("3° lugar: R$" + terceiro);

        entrada.close();
    }
}