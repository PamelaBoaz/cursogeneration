package Condicional2;

import java.util.Scanner;

public class Exerc�cio45 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lados, medida, area;
		System.out.println("Entre com a quantidade de lados:");
		lados = ler.nextInt();
		System.out.println("Entre com a medida dos lados:");
		medida = ler.nextInt();

		if (lados == 3) {
			area = (medida * medida) / 2;
			System.out.println("Tr�ngulo! O valor da �rea �: " + area);

		}
		if (lados == 4) {
			area = (medida * medida);
			System.out.println("Quadrado! O valor da �rea �:" + area);
		} else if (lados == 5) {
			System.out.println("Pentagono!");

		} else if (lados < 3) {
			System.out.println("N�O � UM POL�GONO");

		} else if (lados > 5) {
			System.out.println("POL�GONO N�O IDENTIFICADO.");
		}
	}

}
