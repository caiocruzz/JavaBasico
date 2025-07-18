package Encapsulamento;

public class FaturaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fatura com dados válidos
		Fatura f1 = new Fatura("001","Teclado", 5, 50);
		
		System.out.println("Fatura Nº: " + f1.getNumero());
		System.out.println("Descrição: " + f1.getDescricao());
		System.out.println("Quantidade: " + f1.getQuantidade());
		System.out.println("Preço por item: R$" + f1.getPrecoPorItem());
		System.out.println("Total da fatura: R$"+ f1.getTotalFatura());
		
		System.out.println("\n-- Testando valores inválidos ---");
		
		
		// Teste com valores negativos
		
		Fatura f2 = new Fatura("002", "Memoria DDR4", -2, -500);

		System.out.println("Fatura Nº: " + f1.getNumero());
		System.out.println("Descrição: " + f1.getDescricao());
		System.out.println("Quantidade: " + f1.getQuantidade());
		System.out.println("Preço por item: R$" + f1.getPrecoPorItem());
		System.out.println("Total da fatura: R$"+ f1.getTotalFatura());
	}

}
