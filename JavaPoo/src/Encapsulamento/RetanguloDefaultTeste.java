package Encapsulamento;

import java.util.Scanner;

public class RetanguloDefaultTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		// Criando Objeto Retângulo com base e altura
		
		RetanguloDefault r = new RetanguloDefault();
				
		
		System.out.println("= = = CÁLCULO DE RETANGULO = = = ");
		System.out.println("Digite a base do RETANGULO:  ");
		r.setBase(entrada.nextDouble());
		
		
		System.out.println("Digite a altura do RETÂNGULO");
		r.setAltura(entrada.nextDouble());
		
		System.out.println();
		
		//Exibindo Resultados
		
		System.out.println("\n === Resultados ====");
		System.out.println("Base: " + r.getBase());
		System.out.println("Altura: " + r.getAltura());
		System.out.println("Área: " + r.calcularArea());
		System.out.println("Perímetro: " + r.calcularPerimetro());
		
		entrada.close();
	}

}
