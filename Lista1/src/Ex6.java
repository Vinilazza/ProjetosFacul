import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double x;


        System.out.println("Digite qual o valor que voce deseja: ");
        x = sc.nextDouble();
        double f=x;

        while (x > 1){
            f = f *(x-1); x--;
        }  
        System.out.println(f);
    }
}
