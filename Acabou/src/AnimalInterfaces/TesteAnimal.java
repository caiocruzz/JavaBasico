package AnimalInterfaces;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // interface nao pode ser instanciada diretamente;
		//Animal a = new Animal(); ❌
		
		
		//CRIANDO OS OBJETOS QUE IMPLEMENTAM A INTERFACE;
		Animal cachorro = new Cachorro("RUBBLINHO");
		Animal gato = new Gato("TOM");
		
		// CHAMANDO OS METODOS DA INTERFACE;
		
		cachorro.emitirSom();
		cachorro.comer();
		gato.emitirSom();
		gato.dormir();
	}

}
