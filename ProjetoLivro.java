package projetoLivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa [2];
		Livro[] l = new Livro [3];
		
		p[0] = new Pessoa("Pedro", 21, 'M');
		p[1] = new Pessoa("Maria",25,'F');
		
		l[0] = new Livro (" Aprendendo Java", "Jose da silva", 500, "natanae");
		l[1] = new Livro ("POO ", "Jose nogueira", 500, "Natanael");
		l[2] = new Livro ("Java avancado", "Maria candido", 800, "Natanael");
		
		
		System.out.println(l[0].detalhes());

	}

}
