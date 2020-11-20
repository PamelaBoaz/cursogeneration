package matrizVetor;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int soma, valor;
		int[][] matriz1 = new int[4][6];
		int[][] matriz2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				valor = 2;
				matriz1[l][c] = valor;

			}

		}
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				valor = 1;
				matriz2[l][c] = valor;
			}

		}
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				m1[l][c] = matriz1[l][c] + matriz2[l][c];
				m2[l][c] = matriz1[l][c] - matriz2[l][c];

			}
		}
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.printf("[" + matriz1[l][c] + "]");
			}
			System.out.println();
		}
		System.out.println();
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.printf("[" + matriz2[l][c] + "]");
			}
			System.out.println();

		}
		System.out.println();

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.printf("[" + m1[l][c] + "]");
			}
			System.out.println();

		}
		System.out.println();
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.printf("[" + m2[l][c] + "]");
			}
			System.out.println();
		}

	}
}
