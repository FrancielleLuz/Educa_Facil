package controller;

import java.util.ArrayList;

import objeto.*;

public class ControlarCasa {
	
	private ArrayList<CasaEscada> arrCasaEscada = new ArrayList<>();
	private ArrayList<CasaPadrao> arrCasaPadrao = new ArrayList<>();
	private ArrayList<CasaPergunta> arrCasaPergunta = new ArrayList<>();

	public ControlarCasa() {
		
	}
	
	public void cadastrarCasaPergunta(int x, int y) {
		cadastrarCasa(true, false, 0, x, y);
	}
	
	public void cadastrarCasaEscada(int x, int y, int proximaCasa) {
		cadastrarCasa(false, true, proximaCasa, x, y);
	}

	public void cadastrarCasaPadrao(int x, int y) {
		cadastrarCasa(false, false, 0, x, y);
	}
	
	public void cadastrarCasa(boolean pergunta, boolean escada, int escadaProximaCasa, int x, int y) {
		if(pergunta) {
			CasaPergunta novaCasa = new CasaPergunta();
			novaCasa.setX(x);
			novaCasa.setY(y);
			novaCasa.setNumero(arrCasaEscada.size()+arrCasaPadrao.size()+arrCasaPergunta.size());
			arrCasaPergunta.add(novaCasa);
		}else if(escada) {
			CasaEscada novaCasa = new CasaEscada();
			novaCasa.setX(x);
			novaCasa.setY(y);
			novaCasa.setProximaCasa(escadaProximaCasa);
			novaCasa.setNumero(arrCasaEscada.size()+arrCasaPadrao.size()+arrCasaPergunta.size());
			arrCasaEscada.add(novaCasa);
		}else {
			CasaPadrao novaCasa = new CasaPadrao();
			novaCasa.setX(x);
			novaCasa.setY(y);
			novaCasa.setNumero(arrCasaEscada.size()+arrCasaPadrao.size()+arrCasaPergunta.size());
			arrCasaPadrao.add(novaCasa);
		}
	}
	
	public int retornarX(int nrCasa) {
		
		boolean valida=false;
		int retorno = -1;
		
		for(int i=0;i<arrCasaPadrao.size();i++) {
			if(arrCasaPadrao.get(i).getNumero() == nrCasa) {
				valida = true;
				retorno = arrCasaPadrao.get(i).getX();
				break;
			}
		}
		
		if(!valida) {
			for(int i=0;i<arrCasaEscada.size();i++) {
				if(arrCasaEscada.get(i).getNumero() == nrCasa) {
					valida = true;
					retorno = arrCasaEscada.get(i).getX();
					break;
				}
			}
		}
		
		if(!valida) {
			for(int i=0;i<arrCasaPergunta.size();i++) {
				if(arrCasaPergunta.get(i).getNumero() == nrCasa) {
					valida = true;
					retorno = arrCasaPergunta.get(i).getX();
					break;
				}
			}
		}
		
		return retorno;
		
	}
	
	public int retornarY(int nrCasa) {
		
		boolean valida=false;
		int retorno = -1;
		
		for(int i=0;i<arrCasaPadrao.size();i++) {
			if(arrCasaPadrao.get(i).getNumero() == nrCasa) {
				valida = true;
				retorno = arrCasaPadrao.get(i).getY();
				break;
			}
		}
		
		if(!valida) {
			for(int i=0;i<arrCasaEscada.size();i++) {
				if(arrCasaEscada.get(i).getNumero() == nrCasa) {
					valida = true;
					retorno = arrCasaEscada.get(i).getY();
					break;
				}
			}
		}
		
		if(!valida) {
			for(int i=0;i<arrCasaPergunta.size();i++) {
				if(arrCasaPergunta.get(i).getNumero() == nrCasa) {
					valida = true;
					retorno = arrCasaPergunta.get(i).getY();
					break;
				}
			}
		}
		
		return retorno;
	}
	
	public int retornarTipo(int nrCasa) {
		
		boolean valida=false;
		int retorno = -1;
		
		for(int i=0;i<arrCasaPadrao.size();i++) {
			if(arrCasaPadrao.get(i).getNumero() == nrCasa) {
				valida = true;
				retorno = 1;
				break;
			}
		}
		
		if(!valida) {
			for(int i=0;i<arrCasaEscada.size();i++) {
				if(arrCasaEscada.get(i).getNumero() == nrCasa) {
					valida = true;
					retorno = 2;
					break;
				}
			}
		}
		
		if(!valida) {
			for(int i=0;i<arrCasaPergunta.size();i++) {
				if(arrCasaPergunta.get(i).getNumero() == nrCasa) {
					valida = true;
					retorno = 3;
					break;
				}
			}
		}
		
		return retorno;
	}
	
	public int retornarCasaProximaEscada(int nrCasa) {
		
		int retorno = -1;
		
		for(int i=0;i<arrCasaEscada.size();i++) {
			if(arrCasaEscada.get(i).getNumero() == nrCasa) {
				retorno = arrCasaEscada.get(i).getProximaCasa();
				break;
			}
		}
		
		return retorno;
	}
	
	public int retornarQtdCasas() {
		return arrCasaEscada.size()+arrCasaPadrao.size()+arrCasaPergunta.size();
	}
	
	public void cadastrarInicial() {
		cadastrarCasaPadrao(25, 635);
		cadastrarCasaPadrao(135, 643);
		cadastrarCasaPadrao(227, 643);
		cadastrarCasaPergunta(312, 643);
		cadastrarCasaPadrao(400, 643);
		cadastrarCasaPadrao(486, 643);
		cadastrarCasaPergunta(573, 643);
		cadastrarCasaEscada(660, 643, 14);
		cadastrarCasaPadrao(743, 643);
		cadastrarCasaPadrao(831, 643);
		cadastrarCasaPadrao(903, 643);
		cadastrarCasaPadrao(903, 589);
		cadastrarCasaPadrao(903, 506);
		cadastrarCasaPergunta(827, 506);
		cadastrarCasaPadrao(743, 506);
		cadastrarCasaPadrao(660, 506);
		cadastrarCasaPadrao(573, 506);
		cadastrarCasaPadrao(483, 506);
		cadastrarCasaPadrao(397, 506);
		cadastrarCasaPergunta(315, 506);
		cadastrarCasaPadrao(227, 506);
		cadastrarCasaPadrao(137, 506);
		cadastrarCasaPergunta(44, 506);
		cadastrarCasaPadrao(44, 455);
		cadastrarCasaPergunta(48, 374);
		cadastrarCasaPadrao(137, 373);
		cadastrarCasaPadrao(227, 373);
		cadastrarCasaPadrao(312, 373);
		cadastrarCasaPadrao(397, 373);
		cadastrarCasaPergunta(483, 373);
		cadastrarCasaEscada(573, 373, 41);
		cadastrarCasaPadrao(660, 373);
		cadastrarCasaPergunta(746, 373);
		cadastrarCasaPadrao(831, 373);
		cadastrarCasaPadrao(903, 373);
		cadastrarCasaPergunta(903, 322);
		cadastrarCasaPadrao(903, 239);
		cadastrarCasaPadrao(831, 239);
		cadastrarCasaPadrao(743, 239);
		cadastrarCasaPergunta(660, 239);
		cadastrarCasaPadrao(573, 239);
		cadastrarCasaPadrao(483, 239);
		cadastrarCasaPadrao(397, 239);
		cadastrarCasaPadrao(315, 239);
		cadastrarCasaEscada(227, 239, 49);
		cadastrarCasaPergunta(135, 239);
		cadastrarCasaPadrao(44, 239);
		cadastrarCasaPergunta(44, 186);
		cadastrarCasaPadrao(44, 106);
		cadastrarCasaPadrao(135, 106);
		cadastrarCasaPadrao(227, 106);
		cadastrarCasaPergunta(312, 106);
		cadastrarCasaPadrao(397, 106);
		cadastrarCasaPadrao(483, 106);
		cadastrarCasaPadrao(573, 106);
		cadastrarCasaPadrao(660, 106);
		cadastrarCasaPadrao(743, 106);
		cadastrarCasaPadrao(831, 106);
		cadastrarCasaPadrao(903, 106);
	}
	
}
