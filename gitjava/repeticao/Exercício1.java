package repeticao;

public class Exercício1 {
	public static void main(String[] args) {

		int resto;
		for (int contador = 1000; contador < 2000; contador++) {
			resto = contador % 11;
			if (resto == 5)
				System.out.println(contador);
		}

	}

}
