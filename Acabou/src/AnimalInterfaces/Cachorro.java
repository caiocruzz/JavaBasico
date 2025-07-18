package AnimalInterfaces;

public class Cachorro implements Animal {
	private String nome;
	
	public Cachorro (String nome) {
		this.nome = nome ;
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
	System.out.println(nome + " diz: AUAU");	
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println(nome + " está comendo.");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println(nome + " está dormindo.");
	}

}
