package desafio2;

public class Main {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Miranda", "Rua Nova Odessa", "1213-4567", 20000, 13000);
		
		System.out.println("Nome: "+fornecedor1.getNome());
		System.out.println("Endere�o: "+fornecedor1.getEndereco());
		System.out.println("Telefone: "+fornecedor1.getTelefone());
		System.out.println("Valor Cr�dito: "+fornecedor1.getValorCredito());
		System.out.println("Valor D�bito: "+fornecedor1.getValorDivida());
		
		System.out.println("Saldo: "+fornecedor1.obterSaldo());
		
		

	}

}
