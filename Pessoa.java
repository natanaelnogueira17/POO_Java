package projetoLivro;

public class Pessoa {

	
		private String nome;
		private int idade;
		private char sexo;
		
		
	
	public void fazerAniver() {
		this.idade = this.idade + 1;	
		
	}
	
	public Pessoa(String nome, int idade , char sexo) { // construtor
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
}
