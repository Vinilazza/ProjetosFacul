import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double salarioMin,quilow,calc;

    System.out.println("Digite qual o valor do salario minimo: ");
    salarioMin = sc.nextDouble();
    System.out.println("Digite qual a quantidade gasta no mes de energia: ");
    quilow = sc.nextDouble();
    quilow = quilow / 100;

    calc = salarioMin * quilow;
    System.out.println(calc);

  }
}
