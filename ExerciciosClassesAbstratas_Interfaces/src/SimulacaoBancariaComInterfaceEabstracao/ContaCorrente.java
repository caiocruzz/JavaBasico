package SimulacaoBancariaComInterfaceEabstracao;

public class ContaCorrente extends Conta {

	public ContaCorrente(String numero, double saldoInicial) {
		super(numero, saldoInicial);
		// TODO Auto-generated constructor stub
		System.out.println("CONTA CO");
		System.out.println("Numero da Conta: " + numero);
		System.out.println("Saldo: R$ " + saldo );
	}

}
