package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Excecoes.QtdMaxJogadorExcpetion;
import Excecoes.QtdMinJogadorExcpetion;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import controller.ControlarTabuleiro;
import java.awt.Color;

public class TelaInicial extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControlarTabuleiro controlaTab = new ControlarTabuleiro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		controlaTab.inicia();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jogo Tabuada Divertida");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(104, 11, 183, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNovoJogador = new JButton("Novo Jogador");
		btnNovoJogador.setForeground(new Color(0, 0, 0));
		btnNovoJogador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					controlaTab.validaNovoJogador();
					TelaCadastro cadastro = new TelaCadastro(controlaTab);
					cadastro.setVisible(true);
				}catch(QtdMaxJogadorExcpetion f){
					JOptionPane.showMessageDialog(null, f.getMessage());
				}		
			}
		});
		btnNovoJogador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNovoJogador.setBounds(42, 205, 125, 23);
		contentPane.add(btnNovoJogador);
		
		JButton btnIniciarJogo = new JButton("Iniciar Jogo");
		btnIniciarJogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					controlaTab.validaInicio();
					TelaTabuleiro tabulero = new TelaTabuleiro(controlaTab);
					tabulero.setVisible(true);
				}catch(QtdMinJogadorExcpetion f){
					JOptionPane.showMessageDialog(null, f.getMessage());
				}	
			}
		});
		btnIniciarJogo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIniciarJogo.setBounds(238, 205, 125, 23);
		contentPane.add(btnIniciarJogo);
		
		JButton btnRegras = new JButton("Regras");
		btnRegras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Regras\n\n"
						+ "* 2 à 4 Jogadores, sendo 1 Jogador Virtual e 3 Jogadores Humanos;\n"
						+ "* Dois ou mais jogadores podem ocupar a mesma casa simultaneamente;\n"
						+ "* Para sortear o dado é somente clicar no botão 'Sortear!';\n"
						+ "* Sortear a quantidade de casa correta para chegar a casa FIM;\n"
						+ "* O primeiro a chegar ao final do tabuleiro vence o jogo.\n\n");
			}
		});
		btnRegras.setBounds(42, 120, 125, 23);
		contentPane.add(btnRegras);
		
		JButton btnComoJogar = new JButton("Como jogar?");
		btnComoJogar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnComoJogar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Como jogar?\n\n"
						+ "O jogo tabuada divertida é um tabuleiro onde algumas casas apresentam perguntas surpresas \n"
						+ "questionando qual é o numero que está faltando para completar o cálculo ou qual é o \n"
						+ "resultado da operação. O jogador sempre terá três opções de respostas para selecionar, \n"
						+ "onde somente uma opção será a correta. Quando o jogador acertar a resposta permanecerá \n"
						+ "na casa atual e se errar voltará para a casa anterior.\n\n"
						+ "Para sortear o dado é somente clicar no botão 'Sortear'. O número sorteado será a \n"
						+ "quantidade de casa que o jogador andará. \n\n"
						+ "O vencedor será o primeira a chegar a casa 'FIM' do tabuleiro, mas para isso tem \n"
						+ "que sortear a quantidade correta de casa faltantes. Enquanto você não acertar, \n"
						+ "ficará parado na casa atual.\n\n"
						+ "Boa Sorte!\n\n");
			}
		});
		btnComoJogar.setBounds(238, 120, 125, 23);
		contentPane.add(btnComoJogar);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo do jogo \u00E9 ensinar a tabuada de uma maneira f\u00E1cil e divertida,");
		lblNewLabel_1.setBounds(22, 63, 392, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFazendoOJogador = new JLabel("fazendo o jogador interagir e aprender ao mesmo tempo.");
		lblFazendoOJogador.setBounds(22, 77, 349, 14);
		contentPane.add(lblFazendoOJogador);
	}
}
