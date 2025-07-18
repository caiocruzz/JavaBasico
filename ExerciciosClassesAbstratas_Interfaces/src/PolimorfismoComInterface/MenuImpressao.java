package PolimorfismoComInterface;

import java.util.Scanner;

public class MenuImpressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int opcao;
		
		do {
			System.out.println("\n=== MENU DE IMPRESSÃO ===");
			System.out.println("1 - Imprimir Relatório");
			System.out.println("2 - Imprimir Contrato");
			System.out.println("3 - Imprimir Currículo");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = entrada.nextInt();
			
			Imprimivel documento = null;
			
			switch (opcao) {
			case 1: 
				documento = new Relatorio();
				break;
			case 2:
				documento = new Contrato();
				break;
			case 3:
				documento = new Curriculo();
				break;
			case 0:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida!");
			
			}
			
			if (documento != null) {
				documento.imprimir();
			
			}
		} while (opcao != 0);
		entrada.close();
	}

}
