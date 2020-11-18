package repeticao;

public class Exercicio10 {
	public static void main(String[] args) {

		int contador1 = 3, contador2 = 5, contagem = 233;
		System.out.println(contagem);

		do {

			if (contagem >= 233 && contagem < 300) {
				contagem += contador2;

			} else if (contagem >= 300 && contagem < 400) {
				contagem += contador1;

			} else if (contagem >= 400 && contagem <= 456) {
				contagem += contador2;
				if (contagem > 456) {
					break;
				}

			}
			System.out.println(contagem);

		} while (contagem <= 456);

	}

}
