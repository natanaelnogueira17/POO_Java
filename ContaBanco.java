package contaBancaria;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

//metodos personalizados, ou seja eu criei esse metodo
	public void estadoAtual() {
		System.out.println("--------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("status: " + this.getStatus());
		System.out.println("--------------------------------------------");
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if (this.saldo > 0) {
			System.out.println(" Existe saldo na conta, Conta nao pode ser encerrada");
		} else if (this.saldo < 0) {
			System.out.println("Saldo negativo. por favro regularize para encerrar a conta ");
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");
		}

	}

	public void depositar(double v) {
		if(this.getStatus() == true) {
		//this.saldo = this.saldo + v;
	  this.setSaldo(this.getSaldo() + v );
	  System.out.println("Deposito de " + v + "  realizado com sucesso na conta de " + getDono() );
	}else {
		System.out.println("Impossivel depositar em uma conta fechada ");
	}}

	public void sacar(double v) {
		if(this.getStatus() == true) {
		if (this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque de R$" + v +" realizado na donta de " + this.getDono());
		}else {
			System.out.println("Saldo insuficiente");
		}

	}else{
		System.out.println("Impossivel sacar de uma conta inativa ");}
	}

	public void pagarMensalidade() {
			int v  = 0;
			if(this.getTipo() == "CC") {
				v = 12;
			}else if(this.getTipo() == "CP") {
				v = 20;
			}
			if (this.getStatus() == true) {
				this.setSaldo(getSaldo() - v);
				System.out.println("mensalidade paga com sucesso por " + this.getDono());
			}else {
				System.out.println("impossivel pagar mensalidade a uma conta fechada");
			}
	}
	// metodo especiais

	public void ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public String getDono() {
		return this.dono;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}

	public boolean getStatus() {
		return this.status;
	}

}
