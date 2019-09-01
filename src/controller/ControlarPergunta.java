package controller;

import java.util.ArrayList;
import objeto.*;

public class ControlarPergunta {
	
	ArrayList<Pergunta> perguntas = new ArrayList<>();
	
	public void cadastraPergunta() {
		
		//Pergunta 0
		Pergunta nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 2 X 2?\n\na) 2\nb) 4\nc) 6");
		nova.setResposta("b");
		perguntas.add(nova);
		
		//Pergunta 1
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 3 X 7?\n\na) 21\nb) 33\nc) 26");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 2
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 4 X 6?\n\na) 32\nb) 40\nc) 24");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 3
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 5 X 9?\n\na) 50\nb) 35\nc) 45");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 4		
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 6 X 3?\n\na) 9\nb) 18\nc) 6");
		nova.setResposta("b");
		perguntas.add(nova);
		
		//Pergunta 5
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 7 X 10?\n\na) 70\nb) 72\nc) 65");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 6
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 8 X 7?\n\na) 56\nb) 24\nc) 60");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 7
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 9 X 1?\n\na) 10\nb) 9\nc) 12");
		nova.setResposta("b");
		perguntas.add(nova);
		
		//Pergunta 8
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 10 X 2?\n\na) 20\nb) 34\nc) 6");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 9
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 5 X 5?\n\na) 10\nb) 24\nc) 25");
		nova.setResposta("c");
		perguntas.add(nova);		

		//Pergunta 10
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 3 X 3?\n\na) 9\nb) 4\nc) 6");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 11
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 2 X 8?\n\na) 9\nb) 14\nc) 16");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 12
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 3 X 9?\n\na) 29\nb) 27\nc) 25");
		nova.setResposta("b");
		perguntas.add(nova);
		
		//Pergunta 13
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 4 X 3?\n\na) 12\nb) 8\nc) 14");
		nova.setResposta("a");
		perguntas.add(nova);

		//Pergunta 14
		nova = new Pergunta();
		nova.setPergunta("Qual é o resultado do cálculo: 5 X 6?\n\na) 19\nb) 34\nc) 30");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 15
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: 5 X (?) = 5?\n\na) 5\nb) 1\nc) 3");
		nova.setResposta("b");
		perguntas.add(nova);

		//Pergunta 16
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: 2 X (?) = 10?\n\na) 5\nb) 1\nc) 3");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 17
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: 4 X (?) = 16?\n\na) 5\nb) 4\nc) 3");
		nova.setResposta("b");
		perguntas.add(nova);

		//Pergunta 18
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: 2 X (?) = 18?\n\na) 6\nb) 11\nc) 9");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 19
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: 10 X (?) = 30?\n\na) 2\nb) 3\nc) 9");
		nova.setResposta("b");
		perguntas.add(nova);
		
		//Pergunta 20
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: (?) X 2 = 14?\n\na) 2\nb) 3\nc) 7");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 21
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: (?) X 4 = 32?\n\na) 8\nb) 4\nc) 9");
		nova.setResposta("a");
		perguntas.add(nova);
		
		//Pergunta 22
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: (?) X 1 = 10?\n\na) 8\nb) 10\nc) 9");
		nova.setResposta("b");
		perguntas.add(nova);	
		
		//Pergunta 23
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: (?) X 6 = 36?\n\na) 8\nb) 10\nc) 6");
		nova.setResposta("c");
		perguntas.add(nova);
		
		//Pergunta 24
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: (?) X 4 = 36?\n\na) 8\nb) 10\nc) 9");
		nova.setResposta("c");
		perguntas.add(nova);	

		//Pergunta 25
		nova = new Pergunta();
		nova.setPergunta("Qual número está faltando no cálculo: (?) X 6 = 48?\n\na) 8\nb) 10\nc) 9");
		nova.setResposta("a");
		perguntas.add(nova);	
	}
	
	public int quantidadePerguntas() {
		return perguntas.size()-1;
	}
	
	public int sortearPergunta(){	
		return (int) (Math.random()*quantidadePerguntas());
	}
	
	public String retornarPergunta(int index) {
		return perguntas.get(index).getPergunta();
	}
	
	public String pegarResposta(int index) {
		return perguntas.get(index).getResposta();		
	}
	
	public boolean validaResposta(int index, String resposta) {
		
		if (perguntas.get(index).getResposta().equals(resposta)) {
			return true;
		}else {
			return false;			
		}	
	}
	
}
