
import java.util.Scanner;

public class AnopSeculo {
	static void AnopSeculo(int ano) {
		if (ano <= 0)
			System.out.print("numero invalido");
		else if (ano <= 100)
			System.out.print("primeiro ano \n");
		else if (ano % 100 == 0)
			System.out.print(ano / 100);
		else
			System.out.print(ano / 100 + 1);
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o ano : ");
		int year = leitor.nextInt();
		AnopSeculo(year);
		leitor.close();

	}

}
