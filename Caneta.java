package Aula4;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta() {  //metodo construtor recebe o nome da classe, somente
		this.tampar();
		this.cor = "AZUL";
	}
	public void getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
		
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = false;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public void status () {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada "+ this.tampada);
		
		
	}
}
