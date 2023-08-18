import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conta[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double saldo[] = { 500, 400, 300, 1200, 3400, 4000, 120, 5, 7, 99 }, vDeposito;
        int c, option, cDeposito;
        System.out.println("--- Banco do Vini --- \n"
                + "Digite qual a sua conta: ");
        c = sc.nextInt();
        c--;

        while (true) {
            System.out.println("--- Banco do Vini --- \n"
                    + "Conta [" + conta[c] + "] - Saldo [" + saldo[c] + "] \n"
                    + "Digite 1 para fazer um deposito \n"
                    + "Digite 2 para efetuar o saque \n"
                    + "Digite 3 para consultar o saldo \n"
                    + "Digite 4 para encerrar o programa");
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Qual conta voce deseja depositar? ");
                cDeposito = sc.nextInt();
                if(conta[c] == cDeposito) {
                    System.err.println("Voce não pode depositar para a sua conta!");
                }
                System.out.println("Qual o valor do deposito? ");
                vDeposito = sc.nextDouble();
                if (saldo[c] > vDeposito) {
                        System.out.println("Conta para deposito: "+conta[cDeposito]+"\n"
                        +"Valor do deposito: "+vDeposito+" \n"+
                        "Confirmar deposito? ");
                        if(confirm == true) {
                            
                        }
                        saldo[cDeposito] = saldo[cDeposito] + vDeposito;
                        saldo[c] = saldo[c] - vDeposito;
                        System.out.println("O seu novo saldo é " + saldo[c]);
    

                }
            } else if (option == 2) {

            } else if (option == 3) {

            }

            System.out.println("horas");

        }
    }
}
