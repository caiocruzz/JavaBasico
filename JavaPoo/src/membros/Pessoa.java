package membros;

public class Pessoa {
	
	public String nome;
	public String cpf;
	public String telefone;
	public Date data_nascimento;
	
	

	public Pessoa(String nome, String cpf, String telefone, Date data_nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.data_nascimento = data_nascimento;
	}
}
