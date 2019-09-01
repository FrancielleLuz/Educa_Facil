package controller;

import objeto.Dado;

public class ControlarDado {
	
	private Dado dadoJogo;
	
	public ControlarDado() {
		this.dadoJogo = new Dado();
	}
	
	public int getNumeroSorteado() {
		return dadoJogo.getNumero();
	}

	public void SortearDado(){	
		int sorteioDado =  (int) (Math.random()*6+1);
		dadoJogo.setNumero(sorteioDado);
	}
	
}
