package exercicio2;

public class Main {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("A320", 100000.00, 188);
		
		System.out.println("Modelo: " +aviao1.getModelo());
		System.out.println("Tamanho do tanque: "+aviao1.getTamanhoTanque());
		System.out.println("Acentos: " + aviao1.getQuantidadeAcentos());
		
		System.out.println(aviao1.getQuantidadeAtualCombustivel());
		System.out.println(aviao1.abastecerTanque(50000.00));
		System.out.println(aviao1.getQuantidadeAtualCombustivel());
		System.out.println(aviao1.abastecerTanque(20000.00));
		System.out.println(aviao1.getQuantidadeAtualCombustivel());
		System.out.println(aviao1.abastecerTanque(40000));
		System.out.println(aviao1.getQuantidadeAtualCombustivel());

	}

}
