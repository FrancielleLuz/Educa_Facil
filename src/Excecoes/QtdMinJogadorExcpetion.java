package Excecoes;

@SuppressWarnings("serial")
public class QtdMinJogadorExcpetion extends Exception {
	public QtdMinJogadorExcpetion() {
		super("Ops! É necessário no minimo 1 jogador humano!");
	}
}

