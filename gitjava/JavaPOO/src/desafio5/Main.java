package desafio5;

public class Main {

	public static void main(String[] args) {
		
		Operario operario1 = new Operario("John", "EUA", "123456789", 12000f, 10f, 2000f);
		
		System.out.println("Nome: "+operario1.getNome());
		System.out.println("Endere�o: "+operario1.getEndereco());
		System.out.println("Telefone: "+operario1.getTelefone());
		System.out.println("Valor Produ��o: "+operario1.getValorProducao());
		System.out.println("Comiss�o: "+operario1.getComissao() +"%");
		System.out.println("Sal�rio Base: "+operario1.getSalarioBase());
		System.out.println("Sal�rio final: "+operario1.vencimentoBase());
	}

}
