package exercicio1poli;

public class Cavalo extends Animal{
	
	public Cavalo (String nome, String idade) {
		super (nome, idade);
	}
	public String correr() {
		return("O cavalo está correndo");
	}
	public String somEmitido() {
		return "Neigh Neigh Neight";
	}

}
