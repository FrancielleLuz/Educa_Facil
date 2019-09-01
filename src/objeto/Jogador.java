package objeto;

public class Jogador extends Pessoa{
	
	private int casaAtual = 0;
	private int nr;
	private boolean humano;
	
		
	public void setCasaAtual(int casaAtual) {
		this.casaAtual = casaAtual;
	}

	public int getCasaAtual() {
		return casaAtual;
	}

	public boolean isHumano() {
		return humano;
	}

	public void setHumano(boolean humano) {
		this.humano = humano;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}	
	
}
