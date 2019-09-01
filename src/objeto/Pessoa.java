package objeto;

import Excecoes.IdadeInvalidaExcpetion;
import Excecoes.NomeInvalidoExcpetion;

public class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws NomeInvalidoExcpetion{
		if(nome.equals("")) {
			throw new NomeInvalidoExcpetion();
		}else {
			this.nome = nome;
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) throws IdadeInvalidaExcpetion {
		if(idade <7){
			throw new IdadeInvalidaExcpetion();
		}else {
			this.idade = idade;	
		}
	}
}
