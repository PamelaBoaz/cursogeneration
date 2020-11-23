package exercicio3;

public class Main {

	public static void main(String[] args) {
		
		ProdutoEletronico produtoEletronico1 = new ProdutoEletronico("Celular Xiaomi", true, "Android", 1200.00f);
		
		System.out.println("Nome: " +produtoEletronico1.getModelo()
		+"\nWifi: "+ produtoEletronico1.getWifi()+
		"\nModelo: "+produtoEletronico1.getModelo()+
		"\nPreco: "+produtoEletronico1.getPreco());
		
		System.out.println("Com o aumento do preco, o valor atual é: " + produtoEletronico1.aumentarPreco(100));
		System.out.println("Com o aumento do preco, o valor atual é: " + produtoEletronico1.aumentarPreco(500));
		

	}

}
