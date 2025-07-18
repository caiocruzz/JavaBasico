package OperacoesMatematicas;

public class Divisao implements OperacoesMatematicas {
	@Override
	public double calcula(double a, double b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			System.out.println(" ERRO! 0 NAO DIVIDE!");
			return 0;
		}
		return a / b;
}
}
