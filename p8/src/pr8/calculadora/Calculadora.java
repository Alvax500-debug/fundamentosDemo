package pr8.calculadora;

public class Calculadora {
	
	Pantalla p;
	Teclado t;
	Procesador proc;
	
	public Calculadora() {
		this.p = new Pantalla();
		this.t = new Teclado();
		this.proc = new Procesador();
	}
	
	public void on(){
		String op = " ";
		Complejo c1, c2, cr;
		
		System.out.println("Prendiendo calculadora... ");
		
		//do-while(op != "off")

		do {

			System.out.println("\n(+)Sumar");
			System.out.println("\n(-)Restar");
			System.out.println("\n(*)Multiplicar");
			System.out.println("\n(/)Dividir");
			System.out.println("\n(off)Apagar");
			
			op = t.capturaOper();

			/* if (!op.equals("off")) {
				c1 = t.capturaNumero();
				c2 = t.capturaNumero();
			}else{
				c1 = new Complejo();
				c2 = new Complejo();
			} */
			//c1 = t.capturaNumero();
			//c2 = t.capturaNumero();
			
			switch(op){
				case "+":
					c1 = t.capturaNumero();
					c2 = t.capturaNumero();
					cr = proc.sumar(c1, c2);
					p.imprimirComplejo(cr);
					break;
					
				case "-":
					c1 = t.capturaNumero();
					c2 = t.capturaNumero();
					cr = proc.restar(c1, c2);
					p.imprimirComplejo(cr);
					break;

				case "*":
					c1 = t.capturaNumero();
					c2 = t.capturaNumero();
					cr = proc.multiplicar(c1, c2);
					p.imprimirComplejo(cr);
					break;

				case "/":
					c1 = t.capturaNumero();
					do {
						c2 = t.capturaNumero();
						if (c2.getReal()==0 && c2.getImaginario()==0) {
							System.out.println("Las partes real e imaginaria del segundo numero complejo no puede ser 0, intentalo de nuevo");
						}
					} while (c2.getReal()==0 && c2.getImaginario()==0);
					cr = proc.dividir(c1, c2);
					p.imprimirComplejo(cr);
					break;

				case "off":
					System.out.println("Apagando calculadora ...");
					break;

				default: System.out.println("Op no valido");
			}

		} while (!op.equals("off"));
		
	}

}
