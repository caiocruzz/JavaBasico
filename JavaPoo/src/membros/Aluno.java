package membros;

public class Aluno extends Pessoa{
	public Aluno(String nome, String cpf, String telefone, Date data_nascimento) {
		super(nome, cpf, telefone, data_nascimento);
	}
	public String matricula;
}
