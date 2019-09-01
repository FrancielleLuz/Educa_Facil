package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import controller.ControlarTabuleiro;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class TelaTabuleiro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean humano = false;
	private ControlarTabuleiro controlaTab;

	/**
	 * Create the frame.
	 */
	public TelaTabuleiro(ControlarTabuleiro cT) {
		controlaTab = cT;
		setMaximumSize(new Dimension(1400, 800));
		setMinimumSize(new Dimension(1300, 780));
		setPreferredSize(new Dimension(1200, 900));
		setSize(new Dimension(1251, 752));
		setBounds(5, 5, 557, 471); //POSICAO DA TELA TABULEIRO
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1013, 740);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_1.jpg")));
		lblNewLabel_1.setBounds(21, 638, 22, 22);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_2.jpg")));
		label.setBounds(84, 638, 22, 22);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_3.jpg")));
		label_1.setBounds(21, 707, 22, 22);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_4.jpg")));
		label_2.setBounds(84, 707, 22, 22);
		panel.add(label_2);
		
		JLabel lbl_dado = new JLabel("");
		lbl_dado.setSize(new Dimension(86, 86));
		lbl_dado.setMaximumSize(new Dimension(86, 86));
		lbl_dado.setMinimumSize(new Dimension(86, 86));
		lbl_dado.setBounds(1091, 497, 131, 136);
		getContentPane().add(lbl_dado);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1000, 739);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Tabuleiro3.png")));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_1.jpg")));
		label_3.setBounds(1049, 20, 22, 22);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_2.jpg")));
		label_4.setBounds(1049, 53, 22, 22);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_3.jpg")));
		label_5.setBounds(1049, 86, 22, 22);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(TelaTabuleiro.class.getResource("/img/Pino_4.jpg")));
		label_6.setBounds(1049, 119, 22, 22);
		getContentPane().add(label_6);
		
		String nome="";
		
		nome = controlaTab.retornaNomeInicio(1);
		
		JLabel lbl_Jogador1 = new JLabel(nome);
		lbl_Jogador1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Jogador1.setBounds(1102, 28, 112, 14);
		getContentPane().add(lbl_Jogador1);
		
		nome = controlaTab.retornaNomeInicio(2);
		
		JLabel lbl_Jogador2 = new JLabel(nome);
		lbl_Jogador2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Jogador2.setBounds(1102, 58, 112, 14);
		getContentPane().add(lbl_Jogador2);
		
		nome = controlaTab.retornaNomeInicio(3);
		
		JLabel lbl_Jogador3 = new JLabel(nome);
		lbl_Jogador3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Jogador3.setBounds(1102, 91, 112, 14);
		getContentPane().add(lbl_Jogador3);
		
		nome = controlaTab.retornaNomeInicio(4);
		
		JLabel lbl_Jogador4 = new JLabel(nome);
		lbl_Jogador4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Jogador4.setBounds(1102, 123, 112, 14);
		getContentPane().add(lbl_Jogador4);
		
		JLabel lblJogadorAtual = new JLabel("Jogador Atual");
		lblJogadorAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogadorAtual.setHorizontalTextPosition(SwingConstants.CENTER);
		lblJogadorAtual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJogadorAtual.setBounds(1076, 236, 153, 24);
		getContentPane().add(lblJogadorAtual);
		
		JLabel lbl_JogadorAtual = new JLabel("New label");
		lbl_JogadorAtual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbl_JogadorAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_JogadorAtual.setBounds(1023, 271, 251, 45);
		getContentPane().add(lbl_JogadorAtual);
		
		lbl_JogadorAtual.setText(controlaTab.retornaNomeJogadorAtual());
		
		JButton btnNewButton = new JButton("Sortear!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Inicia Nova jogada
				controlaTab.sorteio();
				lbl_dado.setIcon(new ImageIcon(TelaTabuleiro.class.getResource(controlaTab.caminhoImgDado)));
				lbl_JogadorAtual.setText(controlaTab.retornaNomeJogadorAtual());
				
				boolean finaliza=false;
				int xCasaAnterior, yCasaAnterior, xCasaPosterior, yCasaPosterior;
				int numeroSorteado = controlaTab.retornNrSorteado();
				int casaAnterior = controlaTab.casaAtualJogador();
				int casaPosterior = casaAnterior+numeroSorteado;
				
				//Pega peça do Jogador
				int pecaJogador = controlaTab.pecaAtualJogador();
				
				//Regra - Só vence se chegar exatamente na ultima casa
				if(casaPosterior > controlaTab.retornarNumeroUltimaCasa()) {
					JOptionPane.showMessageDialog(null, "Ops "+controlaTab.retornaNomeJogadorAtual()+", não foi dessa vez!");
					casaPosterior = casaAnterior;
				}
				
				xCasaAnterior = controlaTab.retornarCasaCoordenadaX(casaAnterior);
				yCasaAnterior = controlaTab.retornarCasaCoordenadaY(casaAnterior);
				
				xCasaPosterior = controlaTab.retornarCasaCoordenadaX(casaPosterior);
				yCasaPosterior = controlaTab.retornarCasaCoordenadaY(casaPosterior);
				
				//verifica o tipo da nova casa
				switch (controlaTab.retornarCasaTipo(casaPosterior)) {
				case 1: //Padrao
					
					//seta nova casa
					panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
					controlaTab.setaNovaCasaJogador(casaPosterior);
					
					break;
				case 2: //Escada
					
					panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
					
					JOptionPane.showMessageDialog(null, "Parabens "+controlaTab.retornaNomeJogadorAtual()+", você pegou um atalho!");
					
					casaPosterior = controlaTab.retornarProximaCasaEscada(casaPosterior);
					
					//atualiza e seta nova casa
					xCasaPosterior = controlaTab.retornarCasaCoordenadaX(casaPosterior);
					yCasaPosterior = controlaTab.retornarCasaCoordenadaY(casaPosterior);
					
					panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
					controlaTab.setaNovaCasaJogador(casaPosterior);
					
					break;
				case 3: //Pergunta
					
					//seta nova casa
					panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
					
					//caso errar a pergunta retorna para a casa anterior
					if(!controlaTab.validarPergunta()) {
						panel.getComponent(pecaJogador).setBounds(xCasaAnterior, yCasaAnterior, 22, 22);
						controlaTab.setaNovaCasaJogador(casaAnterior);
					}else {
						controlaTab.setaNovaCasaJogador(casaPosterior);
					}
					
					break;
				}
				
				//se a nova casa for a ultima, finaliza o jogo
				if(controlaTab.validarUltimaCasa(casaPosterior)) {
					finaliza=true;
				}
				
				//verifica se finalizou
				if(finaliza) {
					controlaTab.finaliza();
					dispose();
				}else {
					
					//caso o jogo continue, passa para o proximo jogador
					controlaTab.proximoJogador();
					humano = controlaTab.retornaHumanoJogadorAtual();
					
					//se for jogador virtual - Inicia a jogada dele
					if(!humano) {
						
						controlaTab.sorteio();
						JOptionPane.showMessageDialog(null, "É a vez do Jogador Virtual!");
						lbl_dado.setIcon(new ImageIcon(TelaTabuleiro.class.getResource(controlaTab.caminhoImgDado)));
						lbl_JogadorAtual.setText(controlaTab.retornaNomeJogadorAtual());
						
						finaliza=false;
						numeroSorteado = controlaTab.retornNrSorteado();
						casaAnterior = controlaTab.casaAtualJogador();
						casaPosterior = casaAnterior+numeroSorteado;
						
						
						//Regra - Só vence se chegar exatamente na ultima casa
						if(casaPosterior > controlaTab.retornarNumeroUltimaCasa()) {
							JOptionPane.showMessageDialog(null, "Ops "+controlaTab.retornaNomeJogadorAtual()+", não foi dessa vez!");
							casaPosterior = casaAnterior;
						}
						
						//Pega peça do Jogador
						pecaJogador = controlaTab.pecaAtualJogador();
						
						xCasaAnterior = controlaTab.retornarCasaCoordenadaX(casaAnterior);
						yCasaAnterior = controlaTab.retornarCasaCoordenadaY(casaAnterior);
						
						xCasaPosterior = controlaTab.retornarCasaCoordenadaX(casaPosterior);
						yCasaPosterior = controlaTab.retornarCasaCoordenadaY(casaPosterior);
						
						//verifica o tipo da casa
						switch (controlaTab.retornarCasaTipo(casaPosterior)) {
						case 1: //Padrao
							
							//seta nova casa
							panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
							controlaTab.setaNovaCasaJogador(casaPosterior);
							
							break;
						case 2: //Escada
							
							panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
							
							JOptionPane.showMessageDialog(null, "O jogador virtual pegou um atalho!");
							
							casaPosterior = controlaTab.retornarProximaCasaEscada(casaPosterior);
							
							//atualiza e seta nova casa
							xCasaPosterior = controlaTab.retornarCasaCoordenadaX(casaPosterior);
							yCasaPosterior = controlaTab.retornarCasaCoordenadaY(casaPosterior);
							
							panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
							controlaTab.setaNovaCasaJogador(casaPosterior);
							
							break;
						case 3: //Pergunta
							
							//seta nova casa
							panel.getComponent(pecaJogador).setBounds(xCasaPosterior, yCasaPosterior, 22, 22);
							
							//caso errar a pergunta retorna para a casa anterior
							if(!controlaTab.validarPergunta()) {
								panel.getComponent(pecaJogador).setBounds(xCasaAnterior, yCasaAnterior, 22, 22);
								controlaTab.setaNovaCasaJogador(casaAnterior);
							}else {
								controlaTab.setaNovaCasaJogador(casaPosterior);
							}
							
							break;
						}
						
						//se a nova casa for a ultima, finaliza o jogo
						if(controlaTab.validarUltimaCasa(casaPosterior)) {
							finaliza=true;
						}
						
						if(finaliza) {
							controlaTab.finaliza();
							dispose();
						}else {
							controlaTab.proximoJogador();
							humano = controlaTab.retornaHumanoJogadorAtual();
							JOptionPane.showMessageDialog(null, "Jogador Virtual terminou a jogada!");
							lbl_JogadorAtual.setText(controlaTab.retornaNomeJogadorAtual());
						}				
					}else {
						lbl_JogadorAtual.setText(controlaTab.retornaNomeJogadorAtual());
					}
					
					//terminou a jogada atual, aguarda o proximo click no botão sortear
					
				}
			}
		});
		btnNewButton.setFont(new Font("Ink Free", Font.BOLD, 33));
		btnNewButton.setBounds(1047, 664, 215, 65);
		getContentPane().add(btnNewButton);

	}
}
