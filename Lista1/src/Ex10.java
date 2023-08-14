import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, primo = 0;

        for (int j = 0; j < 5; j++) {

            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            primo = 0;

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
}
