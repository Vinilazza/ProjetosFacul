import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double ladoA, ladoB, ladoC, anguloA, anguloB, anguloC;

        System.out.println("Digite o lado A: ");
        ladoA = sc.nextDouble();
        System.out.println("Digite o lado B: ");
        ladoB = sc.nextDouble();
        System.out.println("Digite o lado C: ");
        ladoC = sc.nextDouble();
        System.out.println("Digite o angulo A: ");
        anguloA = sc.nextDouble();
        System.out.println("Digite o angulo B: ");
        anguloB = sc.nextDouble();
        System.out.println("Digite o angulo C: ");
        anguloC = sc.nextDouble();

        double soma = ladoA + ladoB + ladoC;
        if (soma == 180) {
            System.out.println("O triangulo é retangulo ");
        } else if (anguloA > 90 || anguloB > 90 || anguloC > 90) {
            System.out.println("O triangulo é obtusangulo");
        } else {
            System.out.println("O triangulo é acutangulo");
        }

        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("O triangulo é equilatero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("O triangulo é isoceles");
        } else {
            System.out.println("O triangulo é escaleno");
        }
    }
}
