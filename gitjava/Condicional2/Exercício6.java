package Condicional2;

import java.util.Scanner;

public class Exercício6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("Entre com primeiro valor:");
		valor1 = ler.nextInt();
		System.out.println("Entre com segundo valor:");
		valor2 = ler.nextInt();
		System.out.println("Entre com terceiro valor:");
		valor3 = ler.nextInt();

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor é:" + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor é:" + valor2);
		} else if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor é:" + valor3);
		} else {
			System.out.println("Valores inválidos, reinicie o programa");
		}
	}

}
