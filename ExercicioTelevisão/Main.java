package Project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Televisao met = new Televisao();

		System.out.println(
				"Bem vindo ao menu! \n" + "Digite 1 para aumentar o volume \n" + "Digite 2 para diminuir o volume \n"
						+ "Digite 3 para aumentar o canal \n" + "Digite 4 para diminuir o canal \n"
						+ "Digite 5 para trocar para um canal especifico \n" + "Digite 6 para sair do programa");
		for (int i = 0; i < 100; i++) {

			int option = sc.nextInt();
			if (option == 1) {
				met.aumentaVolume(10);
			} else if (option == 2) {
				met.aumentaVolume(-10);
			} else if (option == 3) {
				met.aumentaCanal(1);
			} else if (option == 4) {
				met.aumentaCanal(-1);
			} else if (option == 5) {
				System.out.println("Qual o canal voce gostaria de ir? ");
				int canal = sc.nextInt();
				met.trocarCanal(canal);
			} else if (option == 6) {
				System.out.println("O sistema está encerrando...");
				break;
			}

			System.out.println("O volume atual é: " + met.volume);
			System.out.println("O canal atual é: " + met.canal);
		}

	}
}
