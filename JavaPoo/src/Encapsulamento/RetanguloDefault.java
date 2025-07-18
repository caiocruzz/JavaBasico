package Encapsulamento;

public class RetanguloDefault {
	
	private double base;
	private double altura;
	
	// Metodos Construtores
public RetanguloDefault() {
	this.base = 0;
	this.altura = 0;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

// Calcular Area

public double calcularArea() {
	return base * altura;
	
}

// Calcular Perímetro

public double calcularPerimetro() {
	return 2 * (base + altura);
}
}

