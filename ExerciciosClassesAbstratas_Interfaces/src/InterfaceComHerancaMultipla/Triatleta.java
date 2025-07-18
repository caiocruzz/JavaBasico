package InterfaceComHerancaMultipla;

public class Triatleta implements Corredor, Nadador{

	private String nome;
	public Triatleta(String nome) {
		this.nome = nome;
	}
	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println(nome+ " está nadando");
	}
	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println(nome + " está correndo");
	}
		
	// metodo que une as duas habilidades.
	public void competir() {
		System.out.println(nome + " iniciou a competição!");
		nadar();
		correr();
		System.out.println(nome + " terminou a competição!");
	
	}
}
