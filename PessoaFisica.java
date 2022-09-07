package Conta;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente ("natanael nogueira");
		cc1.setSaldo (10000);
		System.out.println("Cliente : " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(2000);
		System.out.println("Novo saldo: R$" + cc1.saldo);
		
		System.out.println("****************************************");
		System.out.println("");
		
		Conta cc2 = new Conta();
		cc2.cliente =  ("winny");
		
		cc2.saldo = 20000;
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		cc2.depositar(2000);
		System.out.println("Novo Saldo: R$ " + cc2.saldo);
		
		
		System.out.println("****************************************");
		System.out.println("transferencia");
		System.out.println("Cliente: " + cc2.cliente);
		System.out.println("Favorecido: " + cc1.cliente);
		cc2.transferir(cc1, 5000);
		System.out.println("");
		System.out.println("Cliente: "+ cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("Cliente: "+ cc2.cliente);
		cc2.exibirSaldo();
		System.out.println("*************************************");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
		System.out.println("o relatorio gerencial é : R$  " + relatorio);
		

	}

}
