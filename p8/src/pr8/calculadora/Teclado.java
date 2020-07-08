package pr8.calculadora;

import java.util.Scanner;

public class Teclado {
	
	Scanner leer = new Scanner(System.in);

	public String capturaOper() {
		String ch;
		
		System.out.print("\nOperador: ");
		ch = leer.nextLine();
		ch = leer.nextLine();
		
		return ch;
	}
	
	public Complejo capturaNumero(){
		Complejo comp = new Complejo();
		double re, im;
		
		System.out.print("\nreal: ");
		re = leer.nextDouble();
		comp.setReal(re);
		
		System.out.print("\nimg: ");
		im = leer.nextDouble();
		comp.setImaginario(im);
		
		return comp;
	}
}
