package Jogo;

public class TesteJogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Jogavel rpg = new JogoRpg();
	Jogavel corrida = new JogoCorrida();
	
	   System.out.println("=== Simulação de Jogos ===");

       System.out.println("\n>> RPG:");
       rpg.inciarJogo();
       // Simular jogando...
       rpg.encerrarJogo();

       System.out.println("\n>> Corrida:");
       corrida.inciarJogo();
       // Simular jogando...
       corrida.encerrarJogo();
	}

}
