package collection;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	public static void main(String[] args) {
		List<String> estoque = new ArrayList<String>();

		System.out.println("Itens adicionados");
		estoque.add("Chocolate");
		estoque.add("Mel");
		estoque.add("Leite Condensado");
		estoque.add("Farinha de Trigo");
		estoque.add("A��car Mascavo");
		estoque.add("Canela em p�");
		System.out.println(estoque);
		estoque.remove("Canela em p�");
		estoque.remove("Leite condensado");
		System.out.println(estoque);

		estoque.set(4, "A��car");
		System.out.println(estoque);

		for (String produto : estoque) {
			System.out.println(estoque.indexOf(produto) + "|" + produto);
		}
	}

}
