package Encapsulamento;

public class AnimalEstimacao {
	
	// Atributos privados
	private String nome;
	private String tipo;
	private int idade;
	

	// Metodos construtor
	public AnimalEstimacao(String nome, String tipo, int idade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
