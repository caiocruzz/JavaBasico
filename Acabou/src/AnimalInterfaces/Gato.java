package AnimalInterfaces;

public class Gato implements Animal{
	private String nome;
	
	public Gato(String nome) {
		this.nome = nome;
	}
	

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println(nome + " diz: miaun");
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
