package pr8.calculadora;

public class Procesador {
	
	public Complejo sumar(Complejo c1, Complejo c2){
		Complejo c = new Complejo();
		double re, im;
		
		re = c1.getReal() + c2.getReal();  //(a + c)
		
		im = c1.getImaginario() + c2.getImaginario();  //(b + d)
		
		c.setReal(re);
		c.setImaginario(im);
		
		return c;
	}

}
