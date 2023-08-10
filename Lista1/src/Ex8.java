
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor,compra;

        System.out.println("Qual o valor total da compra?");
        compra = sc.nextDouble();

        System.out.println("Qual o valor do valor dado?");
        valor = sc.nextDouble();

        valor = valor-compra;
        if(valor < 1) {
            System.out.println("O troco devera ser: "+String.format("%.2f ", valor)+" centavos");
        }
        if(valor >= 1) {
            System.out.println("O troco devera ser: "+valor+" reais");
        }


    }
}
