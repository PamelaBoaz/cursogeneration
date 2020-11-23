package desafio5;

public class Main {

	public static void main(String[] args) {
		
		Operario operario1 = new Operario("John", "EUA", "123456789", 12000f, 10f, 2000f);
		
		System.out.println("Nome: "+operario1.getNome());
		System.out.println("Endereço: "+operario1.getEndereco());
		System.out.println("Telefone: "+operario1.getTelefone());
		System.out.println("Valor Produção: "+operario1.getValorProducao());
		System.out.println("Comissão: "+operario1.getComissao() +"%");
		System.out.println("Salário Base: "+operario1.getSalarioBase());
		System.out.println("Salário final: "+operario1.vencimentoBase());
	}

}
