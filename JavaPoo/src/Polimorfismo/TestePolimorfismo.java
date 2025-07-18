package Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal meuAnimal = new Cachorro();
		meuAnimal.emitirSom();
		
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.emitirSom("feliz");
		meuCachorro.emitirSom("bravo");
	}

}
