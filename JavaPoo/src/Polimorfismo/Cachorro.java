package Polimorfismo;

public class Cachorro extends Animal{
	// Sobrescrita: Redefinindo o metodo emitirSom da Superclasse @Override
public void emitirSom() {
	System.out.println("O cachorro late: Au Au!");
}
// Sobrecarga: mesmo nome, assinaturas diferentes
public void emitirSom(String humor) {
	if ("feliz".equals(humor)) {
		System.out.println("O cachorro está feliz: abanando o rabo e latindo!");
	} else if ("bravo".equals(humor)) {
		System.out.println("O cachorro está bravo: rosnando!");
	} else {
		System.out.println("O cachorro faz algum som...");
	}
}
}
