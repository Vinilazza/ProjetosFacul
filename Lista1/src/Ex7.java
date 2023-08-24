import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o intervalo para fazer o fatorial: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int i = n1; i < n2; i++) {

            int f = i;
            int i2 = i;

            while (i2 > 1) {
                f = f * (i2 - 1);
                i2--;
            }
            System.out.println(f);
        }
    }
}
