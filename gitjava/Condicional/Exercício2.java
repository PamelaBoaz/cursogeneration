package Condicional;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int c = 0, n = 0, e = 0, extra = 0, salario = 0;
		System.out.println("Entre com código do funcionário:");
		c = ler.nextInt();
		System.out.println("Entre com o total de horas:");
		n = ler.nextInt();

		if (n > 50) {
			e = (n - 50);
			extra = (e * 20);
			salario = (n * 10) + (extra);

		} else if (n < 50) {
			e = 0;
			extra = e;

		} else {
			salario = (n * 10) + extra;

		}
		System.out.println("Horas excedentes:" + e);
		System.out.println("Valor horas excedentes R$:" + extra);
		System.out.println("Valor total do pagamento R$:" + salario);

	}

}
