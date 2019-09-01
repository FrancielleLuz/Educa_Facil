package controller;

import javax.swing.JOptionPane;

import Excecoes.QtdMaxJogadorExcpetion;
import Excecoes.QtdMinJogadorExcpetion;

public class ControlarTabuleiro {
	
	public String caminhoImgDado;
	private ControlarDado controlaDado = new ControlarDado();
	private ControlarJogador controlaJogador = new ControlarJogador();
	private ControlarPergunta controlaPergunta = new ControlarPergunta();
	private ControlarCasa controlaCasa = new ControlarCasa();
	
	public  void sorteio() {
		controlaDado.SortearDado();
		afterSorteio(controlaDado.getNumeroSorteado());
	}	
	
	private  void afterSorteio(int numSorteado) {
		
		switch (numSorteado) {
		case 1:
			caminhoImgDado = "/img/Dado_1.jpg";
			break;
		case 2:
			caminhoImgDado = "/img/Dado_2.jpg";
			break;
		case 3:
			caminhoImgDado = "/img/Dado_3.jpg";
			break;
		case 4:
			caminhoImgDado = "/img/Dado_4.jpg";
			break;
		case 5:
			caminhoImgDado = "/img/Dado_5.jpg";
			break;
		case 6:
			caminhoImgDado = "/img/Dado_6.jpg";
			break;
		}
		
	}
	
	
	
	public  boolean novoJogador(String nome, int idade, boolean validaHumano) {
		return controlaJogador.CadastrarJogador(nome, idade, validaHumano);
	}
	
	public  void validaInicio() throws QtdMinJogadorExcpetion {
		if (controlaJogador.QuantidadeJogador() < 1) {
			throw new QtdMinJogadorExcpetion();
		}else {
			controlaJogador.CadastrarJogador("Jogador Virtual", 7, false);
		}
	}
	
	public  void validaNovoJogador() throws QtdMaxJogadorExcpetion{
		if(controlaJogador.QuantidadeJogador() == 3) {
			throw new QtdMaxJogadorExcpetion();
		}
	}
	
	public  void inicia() {
		controlaPergunta.cadastraPergunta();
		controlaCasa.cadastrarInicial();
	}
	
	public  int retornNrSorteado() {
		return controlaDado.getNumeroSorteado();
	}
	
	public  int casaAtualJogador() {
		return controlaJogador.retornaJogadorVez().getCasaAtual();
	}
	
	public  int pecaAtualJogador() {
		return controlaJogador.retornaJogadorVez().getNr();
	}
	
	public  void proximoJogador() {
		controlaJogador.setarJogadorVez();
	}
	
	public  void setaNovaCasaJogador(int novaCasa) {
		controlaJogador.retornaJogadorVez().setCasaAtual(novaCasa);
	}
	
	public  String retornaNomeJogadorAtual() {
		return controlaJogador.retornaJogadorVez().getNome();
	}
	
	public  boolean retornaHumanoJogadorAtual() {
		return controlaJogador.retornaJogadorVez().isHumano();
	}
	
	public  void finaliza() {
		String vencedor = controlaJogador.retornaJogadorVez().getNome();
		JOptionPane.showMessageDialog(null, "Fim de Jogo\n\nGanhador: "+vencedor+"\n\nParabéns!!");
	}
	
	public  String retornaNomeInicio(int index) {
		if(controlaJogador.QuantidadeJogador()>=index) {
			return controlaJogador.retornaNomeJogador(index-1);
		}else {
			return "";
		}
	}
	
	public  int atualizarPosicaoX(int x) {
		if((pecaAtualJogador()==1) || (pecaAtualJogador()==3)) {
			x = x+28;
		}
		return x;
	}
	
	public  int atualizarPosicaoY(int y) {
		if((pecaAtualJogador()==2) || (pecaAtualJogador()==3)) {
			y = y+26;
		}
		return y;
	}
	
	public int retornarCasaCoordenadaX(int nr) {
		int x = atualizarPosicaoX(controlaCasa.retornarX(nr));
		return x;
	}
	
	public int retornarCasaCoordenadaY(int nr) {
		int y = atualizarPosicaoY(controlaCasa.retornarY(nr));
		return y;
	}
	
	public int retornarCasaTipo(int nr) {
		return controlaCasa.retornarTipo(nr); // 1-Padrao 2-Escada 3-Pergunta
	}
	
	public int retornarProximaCasaEscada(int nr) {
		return controlaCasa.retornarCasaProximaEscada(nr);
	}
	
	public boolean validarUltimaCasa(int nr) {
		if(nr==controlaCasa.retornarQtdCasas()-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int retornarNumeroUltimaCasa() {
		return controlaCasa.retornarQtdCasas()-1;
	}
	
	public boolean validarPergunta() {
		
		int numeroPergunta = controlaPergunta.sortearPergunta();
		int opcaoSelecionada;
		
		//se o jogador for humano, mostra a pergunta e aguarda a resposta
		if (retornaHumanoJogadorAtual()) {
			String[] options = new String[]{" A ", " B ", " C "};
		    opcaoSelecionada = JOptionPane.showOptionDialog(null, controlaPergunta.retornarPergunta(numeroPergunta), "Pergunta",
		             				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,
		             				null, options, null);
		    String resposta="";
		    if(opcaoSelecionada==0) {
			   resposta="a";
		    }else if(opcaoSelecionada==1) {
			   resposta="b";
		    }else {
			   resposta="c";
		    }
		    
		    //valida resposta e retorna erro ou acerto
		    if(controlaPergunta.validaResposta(numeroPergunta, resposta)) {
		    	JOptionPane.showMessageDialog(null, "Parabéns "+retornaNomeJogadorAtual()+", você acertou a resposta!");
		    	return true;
		    }else {
		    	JOptionPane.showMessageDialog(null, "Que pena "+retornaNomeJogadorAtual()+", você erro a resposta!\n"
		    			+ "Você voltará para a casa "+casaAtualJogador());
		    	return false;
		    }
		}else {
			//se for jogador virtual, sorteia uma resposta
		    opcaoSelecionada = (int) (Math.random()*3);
		    String resposta="";
		    if(opcaoSelecionada==0) {
			   resposta="a";
		    }else if(opcaoSelecionada==1) {
			   resposta="b";
		    }else {
			   resposta="c";
		    }
		    
		    //valida resposta do jogador virtual
		    if(controlaPergunta.validaResposta(numeroPergunta, resposta)) {
		    	JOptionPane.showMessageDialog(null, "Jogador Virtual!\n\nPergunta: "+controlaPergunta.retornarPergunta(numeroPergunta)+"\n\nResposta: "+resposta+"\n\nCorreta!");
		    	return true;
		    }else {
		    	JOptionPane.showMessageDialog(null, "Jogador Virtual!\n\nPergunta: "+controlaPergunta.retornarPergunta(numeroPergunta)+"\n\nResposta: "+resposta+"\n\nIncorreta!");
		    	return false;
		    }
		}
	}
	
}
