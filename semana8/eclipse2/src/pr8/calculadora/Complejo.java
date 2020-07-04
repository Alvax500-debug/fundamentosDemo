package pr8.calculadora;

public class Complejo {
	
	double real;
	double imaginario;
	
	public Complejo() {
		super();
	}

	public Complejo(double real, double imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}

	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImaginario() {
		return imaginario;
	}
	
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	
}
