package exercicio3;

public class ProdutoEletronico {

	// Atributos
	private String nome;
	private Boolean wifi;
	private String modelo;
	private float preco;

	// Construtor
	public ProdutoEletronico(String nome, Boolean wifi, String modelo, float preco) {
		super();
		this.nome = nome;
		this.wifi = wifi;
		this.modelo = modelo;
		this.preco = preco;
	}

	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	// Método
	public float aumentarPreco(float valorAcrescentar) {
		this.preco += valorAcrescentar;

		return this.preco;
	}
}
