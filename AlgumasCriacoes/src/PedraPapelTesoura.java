import java.util.Scanner;

	public class PedraPapelTesoura {
		public static void main(String[] args) {

			int j1 = 1;
			int j2 = 1;

			System.out.println("O jogo Será Melhor de 3 , Se prepare ! "); // titulo
			Scanner leitor = new Scanner(System.in);

			while (j1 < 4 || j2 < 4) {
				if (j1 == 4 || j2 == 4) { // condição pra parar o loop e msg Fim
					System.out.println(" È Campeão! ");
					break;
				}

				System.out.println("\nJogador 1,  escolha entre  (1)Pedra, (2)Papel e (3)Tesoura ");
				int Escolha1 = leitor.nextInt();
				System.out.println("Jogador 2,  escolha entre  (1)Pedra, (2)Papel e (3)Tesoura ");
				int Escolha2 = leitor.nextInt();
				if (Escolha1 == Escolha2) {
					System.out.println("Deu Empate! ");
				} else if ((Escolha1 == 1 && Escolha2 == 3) || (Escolha1 == 2 && Escolha2 == 1)
						|| (Escolha1 == 3 && Escolha2 == 2)) // lógica do game
				{
					System.out.println(" Jogador 1  venceu " + j1++ + " ponto! ");
				} else {
					System.out.println("Jogador 2 venceu " + j2++ + " ponto! ");
				}

			}
		}
	}


