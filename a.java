import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conta[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double saldo[] = { 500, 400, 300, 1200, 3400, 4000, 120, 5, 7, 99 }, vDeposito,sValor,saldoBanco=0;
        int c, option, cDeposito,cConta;
        int confirm;
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
                    + "Digite 4 para consultar o saldo de outra conta \n"
                    + "Digite 5 para consultar o saldo do banco total \n"
                    + "Digite 6 para encerrar o programa");
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
                        "Confirmar deposito? (Digite 1)");
                        confirm = sc.nextInt();
                        
                        if(confirm == 1) {
                                                   saldo[cDeposito] = saldo[cDeposito] + vDeposito;
                        saldo[c] = saldo[c] - vDeposito;
                        System.out.println("O seu novo saldo é " + saldo[c]);
                        }
                        else {
                            System.out.println("Porfavor digite novamente as informações da conta");
                        }
 
    

                }
            } else if (option == 2) {
                System.out.println("Quanto de valor voce deseja sacar?");
                sValor = sc.nextDouble();
                if(saldo[c] < sValor) {
                    System.out.println("Voce não possui esse saldo para sacar. Seu saldo atual é: "+saldo[c]+"\n");
                }
                else {
                    saldo[c] = saldo[c] - sValor;
                    System.out.println("O seu novo saldo é: "+saldo[c]+"\n");
                }
            } else if (option == 3) {
                System.out.println("Ola! Seu saldo atual é: "+saldo[c]+"\n");
            }
            else if(option == 4) {
                System.out.println("Qual conta voce deseja consultar? ");
                cConta = sc.nextInt();
                System.out.println("A conta "+cConta+" possui "+saldo[cConta]);
            }
            else if(option == 5) {
                for(int i=0;i<saldo.length;i++) {
                    saldoBanco = saldo[i] + saldoBanco;
                }
                System.out.println("O valor total que possuimos no banco é: "+saldoBanco+" \n");
            }
            else if(option == 6) {
                System.out.println("Encerrando sua sessão!");
                break;
            }


        }
    }
}
