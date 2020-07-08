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

		re = c1.getReal() - c2.getReal();	//(a + c)

		im = c1.getImaginario() - c2.getImaginario();	//(b + d)

		Complejo c = new Complejo(re,im);

		return c;
	}

	public Complejo multiplicar(Complejo c1, Complejo c2) {
		double fr1, fr2; 
		double fi1, fi2;
		
		Complejo c = new Complejo();

		fr1 = c1.getReal() * c2.getReal();	//(a * c)
		fr2 = c1.getImaginario() * c2.getImaginario();	//(b * d)

		fi1 = c1.getReal() * c2.getImaginario();	//(a * d)
		fi2 = c1.getImaginario() * c2.getReal();	//(b * c)
		
		c.setReal(fr1 - fr2);	//(ac - bd)
		c.setImaginario(fi1 + fi2);	//(ad + bc)

		return c;
	}

	public Complejo dividir(Complejo c1, Complejo c2) {
		double fr1, fr2; 
		double fi1, fi2;
		double re, im, cociente;

		Complejo c = new Complejo();

		fr1 = c1.getReal() * c2.getReal();	//(a * c)
		fr2 = c1.getImaginario() * c2.getImaginario();	//(b * d)

		fi1 = c1.getImaginario() * c2.getReal();	//(b * c)
		fi2 = c1.getReal() * c2.getImaginario();	//(a * d)
				
		cociente = Math.pow(c2.getReal(), 2) + Math.pow(c2.getImaginario(), 2);	//((c^2) + (d^2))

		re = (fr1 + fr2) / cociente;	//(ac + bd) / ((c^2) + (d^2))
		im = (fi1 - fi2) / cociente;	//(bc - ad) / ((c^2) + (d^2))

		c.setReal(re);
		c.setImaginario(im);

		return c;
	}

}
