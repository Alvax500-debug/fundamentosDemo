package pr8.calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola Mundo");
		
		/* Complejo c1 = new Complejo(3.0,4.0);
		Complejo c2 = new Complejo(1.0,2.0);
		
		Complejo c3;
		
		Pantalla p = new Pantalla(); */
		
		//p.imprimirComplejo(c1);
		
		/* Procesador proc = new Procesador();
		
		c3 = proc.dividir(c1, c2);
		p.imprimirComplejo(c3); */
		
		/* Teclado t = new Teclado();
		String op;
		
		op = t.capturaOper();
		
		System.out.println(op);
		
		c3 = t.capturaNumero();
		
		p.imprimirComplejo(c3); */
		
		Calculadora cal = new Calculadora();
		
		cal.on();

	}

}
