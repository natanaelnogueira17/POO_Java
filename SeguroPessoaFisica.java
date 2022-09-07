package seguros;

import Conta.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.cliente = "joao nogueira";
		cc3.saldo = 18000;
		System.out.println("Cliente : " + cc3.cliente);
		cc3.exibirSaldo();

	}

}
