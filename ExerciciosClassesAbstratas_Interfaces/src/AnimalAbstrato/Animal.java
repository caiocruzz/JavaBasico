package AnimalAbstrato;

public abstract class Animal {

	protected String nome;
	
	// CONSTRUTOR
	
	public Animal(String nome) {
		this.nome = nome;
	
	}

	// Getter
	
	public String getNome() {
		return nome;
	}

 // metodo abstrato: deve ser implementado nas subclasses
	
	public abstract void emitirSom();
}

