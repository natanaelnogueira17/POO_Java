package Aulas;

public class Caneta {

	public String modelo;
	public String cor;
	protected float ponta;
	protected int carga;
	protected boolean tampada;
	
	void status() {
		System.out.println("uma caneta " + this.cor);
		System.out.println("Esta tampada? " + this.tampada);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
	}
	
	public void rabiscar() {
		if(this.tampada==true) {
			System.out.println("Nao posso Rabiscar!!!");
		}else {
			System.out.println(" Rabiscando _____------_______-----!");
		}
		
	}
	
	protected void tampar (){
		this.tampada = true;
		
		
	}
	
	protected void destampar() {
		this.tampada = false;
	}

}
