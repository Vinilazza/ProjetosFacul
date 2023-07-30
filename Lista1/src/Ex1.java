import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        double horas,valorHora,salarioBr,salarioLiq;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas: ");
        horas = sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        salarioBr = (horas * valorHora);
        salarioLiq = salarioBr - (salarioBr * 0.3) ;

        System.out.println("O salario bruto é: "+salarioBr);
        System.out.println("O salario liquido é: "+salarioLiq);
    }
}
