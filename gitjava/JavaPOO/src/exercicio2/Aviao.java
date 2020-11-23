package exercicio2;

public class Aviao {

	// Atributos
	private String modelo;
	private double quantidadeAtualCombustivel;
	private double tamanhoTanque;
	private int quantidadeAcentos;

	// Construtor
	public Aviao(String modelo, double tamanhoTanque, int quantidadeAcentos) {
		super();
		this.modelo = modelo;
		this.tamanhoTanque = tamanhoTanque;
		this.quantidadeAcentos = quantidadeAcentos;
		this.quantidadeAtualCombustivel = 0;
	}
	// Getter e Setters

	public String getModelo() {
		return modelo;
	}

	public double getQuantidadeAtualCombustivel() {
		return quantidadeAtualCombustivel;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getTamanhoTanque() {
		return tamanhoTanque;
	}

	public void setTamanhoTanque(double tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}

	public int getQuantidadeAcentos() {
		return quantidadeAcentos;
	}

	public void setQuantidadeAcentos(int quantidadeAcentos) {
		this.quantidadeAcentos = quantidadeAcentos;
	}
	
	//Métodos Específicos
	public String abastecerTanque(double combustivel) {
		if(this.quantidadeAtualCombustivel + combustivel <= this.tamanhoTanque) {
			this.quantidadeAtualCombustivel = this.quantidadeAtualCombustivel + combustivel;
			return "Abastecido com sucesso!";
		}else {
			return "Não foi possível abastecer!";
		}
		
	}
}
