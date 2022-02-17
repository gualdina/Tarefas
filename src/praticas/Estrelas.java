package praticas;

import java.util.Scanner;

public class Estrelas {

	public static void main(String[] args) {
		System.out.println("Introduza o número N:");
		
		Scanner N = new Scanner(System.in);
		
		int colunas = N.nextInt();

		for (int i = 1; i <= colunas; i++) {

			int linhas = 0;

			while (linhas++ < colunas) {
				System.out.println("Padrão de estrelas");
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}

