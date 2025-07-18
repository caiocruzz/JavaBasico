package membros;

public class Professor extends Pessoa{
public Professor(String nome, String cpf, String telefone, Date data_nascimento) {
	super(nome, cpf, telefone, data_nascimento);
}
public double salario;
public String disciplina;
}
