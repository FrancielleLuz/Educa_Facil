package Excecoes;

@SuppressWarnings("serial")
public class IdadeInvalidaExcpetion extends Exception {
	public IdadeInvalidaExcpetion() {
		super("Sua idade � menor que 7 anos!");
	}
}
