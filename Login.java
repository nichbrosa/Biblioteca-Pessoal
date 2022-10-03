import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(123, 102, 95, 25);
		contentPane.add(lblNewLabel);
		
		txtnome = new JTextField();
		txtnome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnome.setBounds(190, 102, 135, 26);
		contentPane.add(txtnome);
		txtnome.setColumns(10);

		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSenha.setBounds(123, 137, 95, 25);
		contentPane.add(lblSenha);
		
		txtsenha = new JTextField();
		txtsenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtsenha.setColumns(10);
		txtsenha.setBounds(190, 137, 135, 26);
		contentPane.add(txtsenha);
		
		/**botao se clicar e retornar verdadeiro nome Nicholas e senha 123 ele mostrara a o arquivo "Tela2" 
		 * senao aparece um aviso de dados invalidos*/
		JButton btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checklogin(txtnome.getText(), txtsenha.getText())) {
				Tela2 tela = new Tela2(); 
				tela.setVisible(true);
				String nome1 = txtnome.getText();
				JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!", "Parabens!", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Dados invalidos", "Tente novamente", JOptionPane.INFORMATION_MESSAGE);
				 }
				}
			
		});
		btnlogin.setBounds(133, 190, 179, 63);
		contentPane.add(btnlogin);

		contentPane.getRootPane().setDefaultButton(btnlogin);
		}
	//boolean para checar login do nome e senha
	public boolean checklogin(String nome, String senha) {
		return nome.equals("Nicholas") && senha.equals("123");
		
	}
}