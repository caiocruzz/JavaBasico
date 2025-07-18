package Polimorfismo;

public class Novo extends Imovel {
	private double adicional;
	
	public Novo (String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}
	
	public double getPrecoFinal() {
		return preco + adicional;
	}
	
	public void imprimir() {
		System.out.println("Imovel novo: ");
		System.out.println("Endereco: " + endereco);
		System.out.println("Preco final: R$" + getPrecoFinal());
	}
}
