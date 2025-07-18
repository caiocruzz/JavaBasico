package JavaPoo;

public class UsoClasseAtributos {

	public UsoClasseAtributos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atributos cliente01 = new Atributos();
		System.out.println(cliente01.fname);
		System.out.println(cliente01.lname);
		System.out.println(cliente01.idade);
		System.out.printf("O aluno %s %s tem %d anos",
		cliente01.fname, cliente01.lname, cliente01.idade);
	}

}
