package desafio6;

public class Main {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("Zigs", "Summoners Rift", "45698-9704", 10000, 5, 1200);

		System.out.println("Nome: " + vendedor1.getNome());
		System.out.println("Endereço: " + vendedor1.getEndereco());
		System.out.println("Telefone: " + vendedor1.getTelefone());
		System.out.println("Valor de Vendas: R$" + vendedor1.getValorVendas());
		System.out.println("Comissão: " + vendedor1.getComissao() + "%");
		System.out.println("Salário Base: R$" + vendedor1.getSalarioBase());
		System.out.println("Salário Final: R$" + vendedor1.salarioFinal());

	}

}
