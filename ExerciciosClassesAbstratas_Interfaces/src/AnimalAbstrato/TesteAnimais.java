package AnimalAbstrato;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal a = new Animal("Genérica"); NAO PODE! CLASSE ABSTRATA NAO PODE SER INSTANCIADA!
		
		// CRIANDO INSTANCIAS DE CLASSES CONCRETAS
		Cachorro c = new Cachorro("RUBBLE");
		Gato g = new Gato("TOOOM");

		// USANDO OS METODOS SOBRESCRITOS
		
		c.emitirSom();
		g.emitirSom();
	}

}
