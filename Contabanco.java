package aula05;

public class Contabanco {
//atributos - variaveis 
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// metodos
	
	public void estadoAtual() {
		System.out.println("conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo() );
		System.out.println("Status: " + this.getStatus());
		
	}

	private boolean getStatus() {
		// TODO Auto-generated method stub
		return null;
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

	private void setTipo(String t) {
		// TODO Auto-generated method stub
		
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println(" Conta não pode ser fechada, saldo positivo");
		} else if (this.getSaldo() < 0) {
			System.out.println(" Conta não pode ser fechada, saldo negativo");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}

	}

	public void depositar(float v) {

		if (this.status == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar");
		}

	}

	public void sacar(float v) {
		if (this.getStatus(true)) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel sacar de um conta fechada");
		}
	}

	private boolean getStatus(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;

		} else if (this.getTipo() == "CP" ) {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada ");
		}

	}

	// metodos especiais

	public void ContaBanco() {
		this.saldo = 0;
		this.status = false;

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
