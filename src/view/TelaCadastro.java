package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Excecoes.QtdMaxJogadorExcpetion;
import controller.ControlarTabuleiro;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDescNome;
	private JTextField textDescIdade;
	private ControlarTabuleiro controlaTab;

	/**
	 * Create the frame.
	 */
	public TelaCadastro(ControlarTabuleiro cT) {
		controlaTab = cT;
		setTitle("Cadastro Jogador");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(830, 430, 297, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 36, 46, 14);
		contentPane.add(lblIdade);
		
		textDescNome = new JTextField();
		textDescNome.setBounds(53, 8, 122, 20);
		contentPane.add(textDescNome);
		textDescNome.setColumns(10);
		
		textDescIdade = new JTextField();
		textDescIdade.setBounds(53, 33, 55, 20);
		contentPane.add(textDescIdade);
		textDescIdade.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(10, 81, 100, 23);
		contentPane.add(btnCancelar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int vIdade = 0;
				boolean sucesso;
				
				try{
					controlaTab.validaNovoJogador();
					try {
						vIdade = Integer.parseInt(textDescIdade.getText());
						sucesso = controlaTab.novoJogador(textDescNome.getText(),vIdade,true);
						if (sucesso) {
							textDescNome.setText("");
							textDescIdade.setText("");						
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Erro - Permitido somente número inteiro!");					
					}
				}catch(QtdMaxJogadorExcpetion f){
					JOptionPane.showMessageDialog(null, f.getMessage());
				}							
			}
		});
		btnCadastrar.setBounds(181, 81, 100, 23);
		contentPane.add(btnCadastrar);
	}
}
