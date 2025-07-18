package PolimorfismoComInterface;

import java.util.ArrayList;

public class TesteImprimivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Imprimivel> documentos = new ArrayList<>();
		
		documentos.add(new Relatorio());
		documentos.add(new Contrato());
		documentos.add(new Curriculo());
		
		System.out.println("=== Iniciando Impressões ===");
		for (Imprimivel doc : documentos) {
			doc.imprimir();
		}
	}
}


