package SimulacaoBancariaComInterfaceEabstracao;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero, double saldoInicial) {
		super(numero, saldoInicial);
		// TODO Auto-generated constructor stub
		System.out.println("CONTA POUPANÇA");
		System.out.println("Numero da Conta: " + numero);
		System.out.println("Saldo: R$ " + saldo );
	}

}
