package Condicional;

import java.util.Scanner;

public class Exerc�cio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Calculando a �rea do trai�ngulo");
		int altura = 0, base = 0, area = 0;
		System.out.println("Digite o valor da base: ");
		base = ler.nextInt();
		System.out.println("Digite o valor da altura: ");
		altura = ler.nextInt();

		if (altura > 0 && altura > 0) {
			area = (base * altura) / 2;
			System.out.println("A �rea do tri�ngulo �: " + area);
		} else {
			System.out.println("Voc� digitou n�mero inv�lido!");
		}
	}

}
