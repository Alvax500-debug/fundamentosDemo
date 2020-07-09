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

	public Complejo restar(Complejo c1, Complejo c2) {
		double re, im;

		re = c1.getReal() - c2.getReal();

		im = c1.getImaginario() - c2.getImaginario();

		Complejo c = new Complejo(re,im);

		return c;
	}

	public Complejo multiplicar(Complejo c1, Complejo c2) {
		double fr1, fr2; 
		double fi1, fi2;
		
		Complejo c = new Complejo();

		fr1 = c1.getReal() * c2.getReal();
		fr2 = c1.getImaginario() * c2.getImaginario();

		fi1 = c1.getReal() * c2.getImaginario();
		fi2 = c1.getImaginario() * c2.getReal();
		
		c.setReal(fr1 - fr2);
		c.setImaginario(fi1 + fi2);

		return c;
	}

	public Complejo dividir(Complejo c1, Complejo c2) {
		double fr1, fr2; 
		double fi1, fi2;
		double re, im, cociente;

		Complejo c = new Complejo();

		fr1 = c1.getReal() * c2.getReal();
		fr2 = c1.getImaginario() * c2.getImaginario();

		fi1 = c1.getImaginario() * c2.getReal();
		fi2 = c1.getReal() * c2.getImaginario();
				
		cociente = Math.pow(c2.getReal(), 2) + Math.pow(c2.getImaginario(), 2);

		re = (fr1 + fr2) / cociente;
		im = (fi1 - fi2) / cociente;

		c.setReal(re);
		c.setImaginario(im);

		return c;
	}

}
