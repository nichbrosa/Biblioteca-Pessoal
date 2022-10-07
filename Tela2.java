import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Tela2 extends JFrame {

	private JPanel lblresto;
	private JTextField txtnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 frame = new Tela2();
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
	public Tela2() {
		
		//chama biblioteca ContaCorrente
		ContaCorrente conta = new ContaCorrente("Nicholas", 1, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		lblresto = new JPanel();
		lblresto.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(lblresto);
		lblresto.setLayout(null);
		
		txtnum = new JTextField();
		txtnum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtnum.setBounds(203, 38, 96, 19);
		lblresto.add(txtnum);
		txtnum.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(162, 41, 45, 13);
		lblresto.add(lblValor);
		
		JLabel lbl1 = new JLabel("Saldo");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setBounds(212, 110, 53, 33);
		lblresto.add(lbl1);
		
		JLabel lblsaldo = new JLabel(Double.toString(conta.getSaldo()));
		lblsaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblsaldo.setBounds(258, 113, 41, 26);
		lblresto.add(lblsaldo);
		
		
		/**ao clicar no botao sacar ele puxa a funcao de sacar do programa ContaCorrente 
		  e seta o saldo com base do saldo da conta corrente no label saldo **/
		JButton buttonSacar = new JButton("Sacar");
		buttonSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conta.sacar(Double.parseDouble(txtnum.getText()));
				lblsaldo.setText(Double.toString(conta.getSaldo()));
			}
		});
		buttonSacar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonSacar.setBounds(154, 79, 96, 21);
		lblresto.add(buttonSacar);
		
		/**ao clicar no botao depositar ele puxa a funcao de depositar do programa ContaCorrente 
		  e seta o saldo com base do saldo da conta corrente no label saldo **/
		JButton buttonDepositar = new JButton("Depositar");
		buttonDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conta.depositar(Double.parseDouble(txtnum.getText()));
				lblsaldo.setText(Double.toString(conta.getSaldo()));
			}
		});
		buttonDepositar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonDepositar.setBounds(264, 79, 112, 21);
		lblresto.add(buttonDepositar);
		
		//abre a tela da calculadora ao clicar no botao
		JButton btnnovatela = new JButton("Calculadora");
		btnnovatela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCalculadora calc = new TelaCalculadora();
				calc.setVisible(true);
				//fechar a tela antiga
				dispose();
			}
		});
		btnnovatela.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnnovatela.setBounds(188, 153, 156, 60);
		lblresto.add(btnnovatela);
		
		
		//quando a tela entrar aqui a partir da tela login ele mostra o nome da pessoa(incompleto)
		Login login = new Login();
		JLabel lblnome = new JLabel("Seja bem-vindo: Nicholas");
		lblnome.setHorizontalAlignment(SwingConstants.CENTER);
		lblnome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblnome.setBounds(10, 0, 416, 31);
		lblresto.add(lblnome);
		
	}
}
