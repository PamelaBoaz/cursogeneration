package repeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double salario = 0.00, mediaSalario = 0.00, maior = 0.00, somaSalario = 0.00, percentual = 0;
		double filhos = 0, somaFilhos = 0, mediaFilhos = 0;
		int contador = 0, menor = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite o seu sal�rio:");
			salario = read.nextDouble();
			System.out.println("Digite a quantidade de filhos:");
			filhos = read.nextDouble();
			somaSalario += salario;
			somaFilhos += filhos;
			contador++;
			mediaSalario = (somaSalario / contador);
			mediaFilhos = (somaFilhos / contador);

			if (salario > maior) {
				maior = salario;
			}
			if (salario <= 100) {
				menor++;

				percentual = ((menor * 100) / 20);

			}

		}
		System.out.println(	"A m�dia salarial da popul��o � R$:" + mediaSalario + " e a m�dia de filhos �: " + mediaFilhos);
		System.out.println("O maior sal�rio � R$:" + maior);
		System.out.println("O percentual de pessoas com s�lario at� R$100,00 �:" + percentual);
	}

}
