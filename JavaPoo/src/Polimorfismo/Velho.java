package Polimorfismo;

public class Velho extends Imovel {
	private double desconto;
	
	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	
	public double getDesconto() {
		return desconto;
	}

	public double getPrecoFinal() {
		return preco - desconto;
	}
	
	public void imprimir() {
		System.out.println("Imovel Velho: ");
		System.out.println("Endereco: "+ endereco);
		System.out.println("Preco final: " + getPrecoFinal());
	}
}
