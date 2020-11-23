package desafio6;

public class Vendedor extends Pessoa {

	private float valorVendas;
	private float comissao;
	private float salarioBase;

	public Vendedor(String nome, String endereco, String telefone, float valorVendas, float comissao,
			float salarioBase) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salarioBase = salarioBase;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float salarioFinal() {
		float salarioFinal;
		salarioFinal = this.salarioBase + (this.valorVendas * (comissao/100));
		return salarioFinal;
	}

}
