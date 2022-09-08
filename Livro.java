package projetoLivro;

public class Livro implements Publicacao{

	
		private String titulo;
		private String autor;
		private int totalPag;
		private int pagAtual;
		private boolean aberto;
		private String leitor;
		
		
	public String detalhes() {
		return "Livro{" + "titulo=" + titulo + ", autor= " 
				+ autor + "totPaginas = " + totalPag
				+ ", pagAtual=" + pagAtual + ", aberto = "
				+ aberto + ", leitor=" + this.getLeitor() + '}';
	}
	
	
	public Livro(String titulo, String autor, int totalPag, String leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotalPag() {
		return totalPag;
	}


	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean isAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public String getLeitor() {
		return leitor;
	}


	public void setLeitor(String leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		this.aberto = true;
		
	}


	@Override
	public void fechar() {
		this.aberto = false;
		
	}


	@Override
	public void foliar(int p) {
		this.pagAtual = p;
		
	}


	@Override
	public void avancarPag() {
		this.pagAtual ++;
		
	}


	@Override
	public void voltarPag() {
		this.pagAtual --;
		
		
	}

}
