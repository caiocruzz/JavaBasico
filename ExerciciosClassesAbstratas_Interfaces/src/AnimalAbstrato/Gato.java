package AnimalAbstrato;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println(nome + " diz: Miaaawn!");
	}

}
