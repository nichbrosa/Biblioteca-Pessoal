

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CalculadoraJframe.Calculadora;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		//chamar biblioteca criada calculadora
		Calculadora calc = new Calculadora();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblN1 = new JLabel("Num1:");
		lblN1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN1.setBounds(40, 29, 66, 25);
		contentPane.add(lblN1);
		
		txtnum1 = new JTextField();
		txtnum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnum1.setBounds(116, 29, 104, 26);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		JLabel lblN2 = new JLabel("Num2:");
		lblN2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN2.setBounds(40, 64, 66, 25);
		contentPane.add(lblN2);
		
		txtnum2 = new JTextField();
		txtnum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnum2.setColumns(10);
		txtnum2.setBounds(116, 65, 104, 26);
		contentPane.add(txtnum2);
		
		JLabel lbl = new JLabel("Num1");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl.setBounds(154, 175, 66, 25);
		contentPane.add(lbl);
		
		JLabel lblresult = new JLabel("0");
		lblresult.setHorizontalAlignment(SwingConstants.CENTER);
		lblresult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblresult.setBounds(291, 175, 66, 25);
		contentPane.add(lblresult);
		
		JLabel lbldenominador = new JLabel(".");
		lbldenominador.setHorizontalAlignment(SwingConstants.CENTER);
		lbldenominador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbldenominador.setBounds(187, 175, 57, 25);
		contentPane.add(lbldenominador);
		
		/**botao de acao ao ser apertado seta o numero 1 e 2 com os respectivos numeros digitados nas caixas de texto
		ao mesmo tempo ele seta o denominador no meio dos labels de num1 e num2
		alem de tudo ele faz o calculo de adicao dos denominadores e o +  setado no lugar do '.',seta o resultado para o resultado da conta**/
		JButton btnadicao = new JButton("+");
		btnadicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNum1(Double.parseDouble(txtnum1.getText()));
				calc.setNum2(Double.parseDouble(txtnum2.getText()));
				calc.adicao();
				lbldenominador.setText("+");
				lblresult.setText(Double.toString(calc.getResult()));
				lblresult.setForeground(Color.BLACK);
			}
		});
		btnadicao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnadicao.setBounds(300, 28, 98, 27);
		contentPane.add(btnadicao);
		
		/**botao de acao ao ser apertado seta o numero 1 e 2 com os respectivos numeros digitados nas caixas de texto
		ao mesmo tempo ele seta o denominador no meio dos labels de num1 e num2
		alem de tudo ele faz o calculo de diminuicao dos denominadores e o - e setado no lugar do '.',  seta o resultado para o resultado da conta
		caso o resultado for negativo o numero ficara vermelho, caso ele seja positivo verde**/
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNum1(Double.parseDouble(txtnum1.getText()));
				calc.setNum2(Double.parseDouble(txtnum2.getText()));
				calc.menos();
				lbldenominador.setText("-");
				lblresult.setText(Double.toString(calc.getResult()));
				if(calc.result>0) {
					lblresult.setForeground(Color.GREEN);
				}else {
					lblresult.setForeground(Color.RED);
				}
			}
		});
		btnmenos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnmenos.setBounds(300, 62, 98, 27);
		contentPane.add(btnmenos);
		
		/**botao de acao ao ser apertado seta o numero 1 e 2 com os respectivos numeros digitados nas caixas de texto
		ao mesmo tempo ele seta o denominador no meio dos labels de num1 e num2
		alem de tudo ele faz o calculo de multiplicacao dos denominadores e o * setado no lugar do '.',seta o resultado para o resultado da conta**/
		JButton btnvezes = new JButton("*");
		btnvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNum1(Double.parseDouble(txtnum1.getText()));
				calc.setNum2(Double.parseDouble(txtnum2.getText()));
				calc.mult();
				lbldenominador.setText("*");
				lblresult.setText(Double.toString(calc.getResult()));
				lblresult.setForeground(Color.BLACK);
			}
		});
		btnvezes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnvezes.setBounds(300, 101, 98, 27);
		contentPane.add(btnvezes);
		
		
		/**botao de acao ao ser apertado seta o numero 1 e 2 com os respectivos numeros digitados nas caixas de texto
		ao mesmo tempo ele seta o denominador no meio dos labels de num1 e num2
		alem de tudo ele faz o calculo de divisao dos denominadores e o / setado no lugar do '.',seta o resultado para o resultado da conta**/
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNum1(Double.parseDouble(txtnum1.getText()));
				calc.setNum2(Double.parseDouble(txtnum2.getText()));
				calc.div();
				lbldenominador.setText("/");
				lblresult.setText(Double.toString(calc.getResult()));
				lblresult.setForeground(Color.BLACK);
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btndiv.setBounds(300, 138, 98, 27);
		contentPane.add(btndiv);
		JLabel lblNum = new JLabel("Num2 = ");
		lblNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNum.setBounds(224, 175, 80, 25);
		contentPane.add(lblNum);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    {
			        Tela2 tela = new Tela2();
			        tela.setVisible(true);
			    }
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVoltar.setBounds(10, 227, 96, 26);
		contentPane.add(btnVoltar);
		

	}
}
