package exercicio1;

public class Cliente {

	//Atributos
	private int codigoCliente;
	private long cpf;
	private String nome;
	private int numeroCompras;
	
	//Construtor
	public Cliente(int codigoCliente, long cpf, String nome) {
		super();
		this.codigoCliente = codigoCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.numeroCompras = 0;
	}
	
	//Métodos Getters e Setters
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public int getNumeroCompras() {
		return numeroCompras;
	}

	//Método Específico Cliente
	public int compraRealiza() {
		this.numeroCompras += 1;

		return this.numeroCompras;
	}
	
	
}
