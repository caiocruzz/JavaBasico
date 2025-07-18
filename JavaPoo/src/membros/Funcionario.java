package membros;

public class Funcionario extends Pessoa{
	public Funcionario(String nome, String cpf, String telefone, Date data_nascimento) {
		super(nome, cpf, telefone, data_nascimento);
		
	}
	public double salario;
	public String disciplina;
	public String cargo;
}

