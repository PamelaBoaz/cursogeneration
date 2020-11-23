package desafio5;

public class Operario extends Pessoa{

	private float valorProducao;
	private float comissao;
	private float salarioBase;
	
	//Construtor
	public Operario(String nome, String endereco, String telefone, float valorProducao, float comissao, float salarioBase) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salarioBase = salarioBase;
	}
	//Getters e Setters
	public float getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	//Método
	public float vencimentoBase() {
		float vencimento;
		
		vencimento = this.salarioBase +
				(this.valorProducao * (this.comissao / 100));
		
		return vencimento;
	}
}
