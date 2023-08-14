import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, primo = 0;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo++;
                break;
            }
        }
        if (primo == 0) {
            System.out.println("O numero digitado é primo!");
        } else {
            System.out.println("O numero não é primo!");
        }
    }
}
