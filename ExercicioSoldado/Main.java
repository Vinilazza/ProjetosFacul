package Game;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Soldado> jogadores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String arma = "Fuzil"; 
        Soldado player = new Soldado("Player 1", 20, arma);
        Soldado inimigo1 = new Soldado("Inimigo 1", 10, arma);
        Soldado inimigo2 = new Soldado("Inimigo 2", 10, arma);
        Soldado inimigo3 = new Soldado("Inimigo 3", 10, arma);
        Soldado inimigo4 = new Soldado("Inimigo 4", 10, arma);

        jogadores.add(player);
        jogadores.add(inimigo1);
        jogadores.add(inimigo2);
        jogadores.add(inimigo3);
        jogadores.add(inimigo4);



        System.out.println("Welcome to the soldier game! \n"
                + "Press A to attack \n"
                + "Press M to move \n"
                + "Press H to heal \n"
                + "Press S to switch weapon \n" 
                + "Press / to quit ");
        
        while (player.getVida() > 0) {
            String option = sc.nextLine();
            if (option.equals("a")) {
                System.out.println("Qual inimigo deseja atacar? (1/4)");
                int enemyIndex = sc.nextInt();
                if (enemyIndex >= 1 && enemyIndex <= 4) {
                    Soldado enemy = jogadores.get(enemyIndex);
                    player.atack(enemy, arma); 
                } else {
                    System.out.println("Número de inimigo inválido.");
                }
            } else if (option.equals("s")) {
                System.out.println("Qual arma deseja usar? (Fuzil, Metralhadora, Revolver, Glock, Ak-47)");
                arma = sc.nextLine();
                player.setArma(arma);
            } else if (option.equals("m")) {
                player.moverPlayer(player);
                for (Soldado inimigo : jogadores) {
                    if (inimigo != player) {
                        player.atacarPlayer(inimigo, player);
                    }
                }
            }
        }
    }


}
