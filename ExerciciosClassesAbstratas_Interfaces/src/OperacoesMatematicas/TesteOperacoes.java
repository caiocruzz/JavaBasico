package OperacoesMatematicas;

public class TesteOperacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 5;
		double y = 2;
		
		OperacoesMatematicas soma = new Soma();
		OperacoesMatematicas subtracao = new Subtracao();
		OperacoesMatematicas multiplicacao = new Multiplicacao();
		OperacoesMatematicas divisao = new Divisao();
		
		System.out.println("Soma: " + soma.calcula(x, y));
		System.out.println("Subtracao: " + subtracao.calcula(x, y));
		System.out.println("Multiplicacao: " + multiplicacao.calcula(x, y));
		System.out.println("Divisao: " + divisao.calcula(x, y));
	}

}
