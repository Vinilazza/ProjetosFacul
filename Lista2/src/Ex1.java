
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorLinhas = 0;

        System.out.println("Valor\tCubo\tRaiz Quadrada");

        while (true) {
            System.out.print("Digite um valor (0 ou negativo para sair): ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break;
            }

            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            System.out.printf("%.2f\t%.2f\t%.2f%n", valor, cubo, raizQuadrada);

            contadorLinhas++;
            if (contadorLinhas % 20 == 0) {
                System.out.println("Valor\tCubo\tRaiz Quadrada");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
