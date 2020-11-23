package desafio2;

public class Fornecedor extends Pessoa{

	private float valorCredito;
	private float valorDivida;
	
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	//Getters e Setters
	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo() {
		float saldo;
		saldo = this.valorCredito - this.valorDivida;

		return saldo;
	}
	
	
	
}
