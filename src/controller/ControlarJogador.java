package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import Excecoes.*;
import objeto.Jogador;

public class ControlarJogador {
	
	ArrayList<Jogador> jogadores = new ArrayList<>();
	int jogadorVez = 0;
	
	
	public boolean CadastrarJogador(String nome, int idade, boolean validaHumano) {
		Jogador nJogador = new Jogador();
				
		try{
			nJogador.setNome(nome);
			try{
				nJogador.setIdade(idade);
				nJogador.setHumano(validaHumano);
				int nr = jogadores.size();
				nJogador.setNr(nr);
				jogadores.add(nJogador);
				if(validaHumano) {
					JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
				}
				return true;
			}catch(IdadeInvalidaExcpetion e){
				JOptionPane.showMessageDialog(null, e.getMessage());
				return false;
			}
		}catch(NomeInvalidoExcpetion e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}
	
	public int QuantidadeJogador() {
		return jogadores.size();
	}
	
	public Jogador retornaJogadorVez() {
		return jogadores.get(jogadorVez);
	}
	
	public String retornaNomeJogador(int index) {
		return jogadores.get(index).getNome();
	}
	
	public void setarJogadorVez() {
		if(jogadorVez==jogadores.size()-1) {
			jogadorVez=0;
		}else {
			jogadorVez++;
		}
	}
	
}
