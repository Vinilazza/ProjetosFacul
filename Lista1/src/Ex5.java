import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      int times,jogadores,i;
      int idade[] = new int[2];
      double peso[] = new double[2];
      double altura[] = new double[2];
      for(i=0;i<2;i++) {
        int cont=1;

          System.out.println("Digite a idade do jogador "+cont);
          idade[i] = sc.nextInt();
          System.out.println("Digite o peso do jogador "+cont);
          peso[i] = sc.nextDouble();
          System.out.println("Digite a altura do jogador "+cont);
          altura[i] = sc.nextDouble();
          cont++;
      }
      for(i=0;i<2;i++) {
        System.out.println();
      }

  }
}
