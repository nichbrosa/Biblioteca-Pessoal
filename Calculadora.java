
public class Calculadora {
	double num1, num2, result;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void adicao() {
		result = num1+num2;
	}
	public void menos() {
		result = num1-num2;
	}
	public void mult() {
		result = num1*num2;
	}
	public void div() {
		result = num1/num2;
	}
	
}
