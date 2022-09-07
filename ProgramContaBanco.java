package contaBancaria;

public class ProgramContaBanco {

	public static void main(String[] args) {
		ContaBanco pessoaUm = new ContaBanco();
		pessoaUm.setNumConta(10010535);
		pessoaUm.setDono("Natanael Nogueira Santos");	
		pessoaUm.abrirConta("CC");
		pessoaUm.depositar(100);
		pessoaUm.sacar(150);
		pessoaUm.fecharConta();
		
		pessoaUm.estadoAtual();
		
		ContaBanco pessoaDois = new ContaBanco();
		pessoaDois.setNumConta(10010536);
		pessoaDois.setDono("Winny da Silva Viana ");
		pessoaDois.abrirConta("CP");
		pessoaDois.depositar(500);
		pessoaDois.sacar(85);
		
		
		
		pessoaDois.estadoAtual();

	}

}
