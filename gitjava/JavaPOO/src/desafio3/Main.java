package desafio3;

public class Main {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Jo�ozinho", "Campinas", "123456789",1234, 1200f, 7.5f);
		
		System.out.println("Nome: "+ empregado1.getNome());
		System.out.println("Telefone: "+empregado1.getTelefone());
		System.out.println("Endere�o: "+empregado1.getEndereco());
		System.out.println("C�digo Setor: "+empregado1.getCodigoSetor());
		System.out.println("Sal�rio Base: "+empregado1.getSalarioBase());
		System.out.println("Imposto: "+empregado1.getImposto());
		System.out.println("Sal�rio Livre: "+empregado1.calcularSalario());
		
		

	}

}
