package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posi��o: " + i + "," + j);
					if (j > 0) {
						System.out.println("N�mero � esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("N�mero de cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("N�mero � direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("N�mero de baixo: " + mat[i + 1][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();
	}
}