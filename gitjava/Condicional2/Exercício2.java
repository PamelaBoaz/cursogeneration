package Condicional2;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senha;
		System.out.println("Digite a senha:");
		senha = ler.nextInt();

		if (senha == 1234) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Acesso Negado!");
		}
	}

}
