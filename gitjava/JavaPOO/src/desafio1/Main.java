package desafio1;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();

		Pessoa pessoa2 = new Pessoa("Maria", "Campinas", "1234-5678");

		Pessoa pessoa3 = new Pessoa("José", "98745-6123");
		
		Pessoa pessoa4 = new Pessoa();
		

		pessoa1.setNome("Bruno");
		pessoa1.setEndereco("Campinas");
		pessoa1.setTelefone("91234-6789");

		System.out.println("Pessoa 1");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getTelefone());
		
		System.out.println("-----------");
		
		System.out.println("Pessoa 2");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getTelefone());
		
		System.out.println("-----------");
		
		System.out.println("Pessoa 3");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getEndereco());
		System.out.println(pessoa3.getTelefone());
		
		System.out.println("-----------");
		System.out.println("Pessoa 4");
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getEndereco());
		System.out.println(pessoa4.getTelefone());
	}

}
