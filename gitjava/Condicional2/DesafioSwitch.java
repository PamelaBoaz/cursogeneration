package Condicional2;

import java.util.Scanner;

public class DesafioSwitch {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lados, medidas, area;
		System.out.println("Entre com a quantidade de lados:");
		lados = ler.nextInt();
		System.out.println("Entre com a medida dos lados:");
		medidas = ler.nextInt();

		switch (lados) {
		case 3: {
			area = (medidas * medidas) / 2;
			System.out.println("Tri�ngulo!A �rea �:" + area);
			break;
		}
		case 4: {
			area = (medidas * medidas);
			System.out.println("Quadrado! A �rea �:" + area);
			break;
		}
		case 5: {
			System.out.println("Pent�gono!");
			break;
		}
		default: {
			System.out.println("Pol�gono n�o identificado!");
			
		}

		}

	}
}