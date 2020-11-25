package exercicio1poli;

public class Main {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Lady", "3");
		System.out.println("Nome:" + cachorro.getNome());
		System.out.println("Idade:" + cachorro.getIdade());
		System.out.println(cachorro.correr());
		System.out.println(cachorro.somEmitido());

		Cavalo cavalo = new Cavalo("Vilão", "10");
		System.out.println("Nome:" + cavalo.getNome());
		System.out.println("Idade:" + cavalo.getIdade());
		System.out.println(cavalo.correr());
		System.out.println(cavalo.somEmitido());

		Preguica preguica = new Preguica("Lila", "15");
		System.out.println("Nome:" + preguica.getNome());
		System.out.println("Idade:" + preguica.getIdade());
		System.out.println(preguica.subir());
		System.out.println(preguica.somEmitido());
	}

}
