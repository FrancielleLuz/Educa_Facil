package Excecoes;

@SuppressWarnings("serial")
public class QtdMinJogadorExcpetion extends Exception {
	public QtdMinJogadorExcpetion() {
		super("Ops! � necess�rio no minimo 1 jogador humano!");
	}
}

