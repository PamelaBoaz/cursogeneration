package exercicio1;

public class Main {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1234, 49328553870L, "Chico");
		
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("Código do cliente: " +cliente1.getCodigoCliente());
		System.out.println("Quantidade de Compra: " + cliente1.getNumeroCompras());
		
		cliente1.compraRealiza();
		cliente1.compraRealiza();
		cliente1.compraRealiza();
		
		System.out.println("Após comprar algumas vezes, o a quantidade de compra é : " + cliente1.getNumeroCompras());
	}
}
