package Encapsulamento;

public class Retangulo {

	private double base;
	private double altura;
	
	// Metodos Construtor
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	// Metodo para Calcular a Área
	
public double calcularArea() {
	return base * altura;
}

// Metodo para calcular o perímetro

public double calcularPerimetro() {
	return 2 * (base + altura);
}
}
