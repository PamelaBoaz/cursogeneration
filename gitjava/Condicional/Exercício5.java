package Condicional;

import java.util.Scanner;

public class Exerc�cio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float indice;
		System.out.println("Entre com �ndice de polui��o:");
		indice = ler.nextFloat();

		if (indice >= 0.05 && indice <= 0.25) {
			System.out.println("Todos os grupos podem operar normalmente!");

		} else if (indice >= 0.3 && indice < 0.4) {
			System.out.println("As ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades");

		} else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("As industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades");

		} else if (indice >= 0.5) {
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
		} else {
			System.out.println("Valor digitado � inv�lido");
		}
	}

}
