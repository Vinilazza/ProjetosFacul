import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int codigo,qntproduto;
    double preco=0;



    System.out.println("Digite qual o codigo do produto: ");
    codigo = sc.nextInt();
    System.out.println("Digite a quantidade do produto: ");
    qntproduto = sc.nextInt();

    if (codigo > 1 && codigo <= 10) {
      preco = 10 * qntproduto;
    }
    else if (codigo >= 11 && codigo <= 20) {
      preco = 15 * qntproduto;
    }
    else if (codigo >= 21 && codigo <= 30) {
      preco = 20 * qntproduto;
    }
    else if (codigo >= 31 && codigo <= 40) {
      preco = 40 * qntproduto;
    }
    if (preco <= 250 ) {
      preco = preco - (preco * 0.05);
    }
    else if(preco >= 250 && preco <= 500) {
      preco = preco - (preco* 0.10);
    } 
    else if(preco > 500) {
      preco = preco - (preco * 0.15);
    }

   System.out.println("O preço final foi: "+preco);
  }
}
