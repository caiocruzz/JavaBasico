package membros;

public class UsoMembros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataNascimento dt = new DataNascimento();
		DataNascimento dt2 = new DataNascimento();
		dt.dia=17;
		dt.mes=8;
		dt.ano=2021;
		dt2.dia=24;
		dt2.mes=01;
		dt2.ano=1999;
		
		System.out.printf("A data de Nascimento " + "é: %d %d %d\n", dt.dia, dt.mes,dt.ano);
		System.out.printf("A data de Nascimento " + "é: %d %d %d", dt2.dia, dt2.mes, dt2.ano);
	}

}