import java.util.Scanner;

public class SalarioDH{
    public static void main(String[] args) {
        
        System.out.println("\nPrograma para determinar el salario de un empleado de acuerdo al numero de horas trabajadas");

        //Nuevo objeto para la clase Scanner para leer datos desde teclado
        Scanner leer = new Scanner(System.in);

        //Comienza el programa
        System.out.print("\nIngrese el salario por hora que cotiza el empleado: ");

        float pagoXhora = leer.nextFloat();

        //NOTA: para operaciones con numeros decimales se debe hacer el cast o conversion al tipo de dato que deseas obtener, 
        //ya que la division entre enteros da como resultado otro entero
        //double factorCF = (double)9/5;

        System.out.print("\nIngrese las horas que ha trabajado el empleado durante su jornada: ");

        int horasTrabajadas = leer.nextInt();

        float sueldo = 0;
        
        sueldo = (float)pagoXhora * horasTrabajadas;

        System.out.println("\nEl sueldo que le corresponde al empleado es $"+sueldo);
    }
}