package Polimorfismo;

import java.util.Scanner;

public class TesteImobiliaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 1 para Imóvel Novo ou 2 para Imóvel Velho: ");
		int opcao = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite o endereço do Imóvel: ");
		String endereco = entrada.nextLine();
		
		System.out.println("Digite o preço base do Imóvel: ");
		double preco = entrada.nextDouble();
		
		if (opcao == 1) {
			System.out.println("Digite o valor adcional do imóvel novo: ");
			double adicional = entrada.nextDouble();
			Novo imovelNovo = new Novo(endereco, preco, adicional);
			imovelNovo.imprimir();
		} else if (opcao == 2) {
			System.out.println("Digite o valor de desconto do imóvel velho: ");
			double desconto = entrada.nextDouble();
			Velho imovelVelho = new Velho(endereco, preco, desconto);
			imovelVelho.imprimir();
			
		} else {
			System.out.println("Opção inválida!");
		}
		entrada.close();
	}

}
