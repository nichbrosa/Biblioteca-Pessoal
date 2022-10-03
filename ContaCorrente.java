public class ContaCorrente {
	
	// Atributos
	private int numero;
	private double saldo;
	private String correntista;
	
	public ContaCorrente(String correntista, int numero, double saldo) {
		this.correntista = correntista;
		this.saldo = saldo;
		this.numero = numero;
	}
	
	// m�todo sacar, depositar, transferir e mostrar saldo.	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque feito com sucesso. Seu novo saldo é: " + saldo);
		}else {
			System.out.println("Está sem saldo seu pobre! Seu saldo é: " + saldo);
		}
		
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean ExisteSaldo() {
		return saldo > 0 ? true : false;
	}
	
	

	// Comportamentos Getters and Setters
	public String getCorrentista() {
		return correntista;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
}
