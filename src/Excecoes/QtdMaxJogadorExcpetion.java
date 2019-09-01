package Excecoes;

@SuppressWarnings("serial")
public class QtdMaxJogadorExcpetion extends Exception {
	public QtdMaxJogadorExcpetion() {
		super("Ops! Quantidade maxima de 3 jogadores humanos!");
	}
}
