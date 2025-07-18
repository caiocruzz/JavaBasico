package membros;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno i = new Aluno("Joyce Kelly","123.456.789-00", null, new Date("24.01.199"));
		System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
		System.out.println("CPF: " + i.cpf);
		System.out.println("Data de nascimento: " + i.data_nascimento.toString());
		
		//Professor  = new Professor("Linguiça","555.666.777-22",new Date());
		
		
	}

}
