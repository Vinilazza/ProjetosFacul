package Project;

public class Televisao {
	int volume;
	int canal;

	void aumentaVolume(int v) {
		if (v < 0 && this.volume == 0) {
			this.volume = 0;
			System.out.println("O volume está mudo!");
		} else if (v > 0 && this.volume == 100) {
			this.volume = 100;
			System.out.println("O volume está no maximo!");
		} else {
			this.volume += v;
		}

	}

	void aumentaCanal(int canal) {
		if (canal < 0 && this.canal == 0) {
			this.canal = 1;
		} else if (canal > 0 && this.canal == 35) {
			this.canal = 1;
		} else {
			this.canal += canal;
		}
	}

	void trocarCanal(int canal) {
		this.canal = canal;
	}

	public Televisao() {
		super();
		this.volume = 30;
		this.canal = 1;
	}

}
