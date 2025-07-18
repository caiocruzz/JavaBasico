package SimulacaoBancariaComInterfaceEabstracao;

public abstract class Conta {
	
	protected	String numero;
	protected	double saldo;

	public Conta(String numero, double saldoInicial) {
	// TODO Auto-generated constructor stub
		this.numero = numero;
		this.saldo = saldoInicial;
	
	}

	public void depositar(double valor) {
		// TODO Auto-generated method stub
		if (valor >0) {
			valor += saldo;
			System.out.println("Depósito de R$ "+ valor + " realizado na conta");
		}
		}
	
	public boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor ) {
		  saldo -= valor;
		  System.out.println("Saque de R$ " + valor + " realizado na conta");
		  return true;
		} else {
			System.out.println("Você não tem saldo "+numero+ "para sacar! de R$ " + valor);
			return false;
		}
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
