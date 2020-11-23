package desafio3;

public class Empregado extends Pessoa {

	private int codigoSetor;
	private float salarioBase;
	private float imposto;

	// Construtor
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	// Método
	public float calcularSalario() {
		float salarioLivre;
		salarioLivre = this.salarioBase - (this.salarioBase * (this.imposto / 100));
		return salarioLivre;
	}

	// Getters e Setters
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

}
