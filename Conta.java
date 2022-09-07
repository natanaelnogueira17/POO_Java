package Conta;

public class Conta {
	//atributos
	protected String cliente;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//contrutor
	public Conta() {
		System.out.println("Agência 0261");
		
	}
	
	// metodos
	protected void exibirSaldo() {
		System.out.println("Saldo: " + saldo);
	}
	
	void sacar(double valor) {
		saldo -=valor;
		System.out.println("débito: R$ " + valor);
	}
	
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Credito: R$ " + valor);
	}
	
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferecnia: R$ " + valor);
	}
	
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
	
	
	

}
