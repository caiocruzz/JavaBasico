package SimulacaoBancariaComInterfaceEabstracao;

public class Pagamento implements Transacao {

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		System.out.println("Executando pagamento de R$ " + valor + " na conta " + conta.getNumero());
	}
	

}
