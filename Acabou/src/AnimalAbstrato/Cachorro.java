package AnimalAbstrato;

public class Cachorro extends Animal{
	
	public Cachorro(String nome) {
		
		super(nome); // Chama o construtor da classe animal
	}

	@Override
	public void emitirSom() {
		System.out.println(nome + " diz: Au au!");
		
	}

}
