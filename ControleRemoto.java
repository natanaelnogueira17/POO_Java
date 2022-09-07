package controlador;

public class ControleRemoto implements Controlador {
	//atributos
	private int volume;
	private boolean ligado;
	private boolean play;	
	// Métodos Especiais
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.play = true;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getPlay() {
		return play;
	}
	public void setPlay(boolean tocando) {
		this.play = tocando;
	}

	// métodos abstratos
	
	public void ligar() {
		this.setLigado(true);
		System.out.println(" ligado ....");
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		System.out.println("Desligado!");
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getPlay());
		System.out.println("Volume: " + this.getVolume());
		for(int i =0;i <= this.getVolume(); i = i + 10 ) {
			System.out.println("[]");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechadno Menu....");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() + 1);
			System.out.println("Volume " + this.getVolume());
			
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() - 1);
			System.out.println("volume: " + this.getVolume());
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(this.getVolume() - this.getVolume());
		}
		
		System.out.println("Mudo"  );
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
		System.out.println("volume " + this.getVolume());
	}

	@Override
	public void play() {
		if(this.getLigado() == true && this.getPlay() == false ) {
			this.setPlay(true);
		}
		System.out.println("Play");
	}

	@Override
	public void pause() {
		if((this.getLigado() && this.getPlay())  == true) {
			this.setPlay(false) ;
		}
		System.out.println("pause");
	}
		
	

	}


