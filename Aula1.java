package Aulas;

public class Aula1 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 10;
		c1.modelo = "compacta ";
		c1.tampar();
		c1.status();		
		c1.rabiscar();
		
		System.out.println("");
		
		Caneta c2 = new Caneta();
		c2.modelo = "BIC";
		c2.cor ="preta";
		c2.ponta = 10;
		c2.carga = 7;
		c2.status();
		c2.destampar();
		c2.rabiscar();
	}

}
