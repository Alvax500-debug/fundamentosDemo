import java.util.Scanner;

public class Cinco_cs{

    static final int nip = 6609;
    static final int disponibilidad = 50000;
    static final int max_deposito = 10000;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nip_usr = 0, respuesta = 0;

        boolean repetir = true;

        while (repetir == true) {
            System.out.println("\nIngrese su NIP:");
            nip_usr = leer.nextInt();
            if (nip_usr == nip) {
                
                System.out.println("\nBienvenido Cliente de cuenta **** 1740");
                do {
                    System.out.println("1) Retirar \n2) Depositar \n3) Salir");
                    System.out.println("Como podemos ayudarte hoy? :");
                    respuesta = leer.nextInt(); 
                    
                    switch (respuesta) {
                        case 1:
                            repetir = retirar();
                            break;

                        case 2:
                            repetir = depositar();
                            break;

                        case 3:
                            System.out.println("Gracias por su preferencia, que tenga un buen dia");
                            repetir = false;
                            break;
                    
                        default:
                            System.out.println("Lo sentimos, opcion no valida para el sistema! \nIntentelo de nuevo");
                            break;
                    }
                } while (respuesta < 1 && respuesta > 3);
                
            } else {
                System.out.println("NIP incorrecto, favor de volver a ingresarlo");
            }
            
        }

    }

    public static boolean retirar(){
        Scanner leer = new Scanner(System.in);
        int cantidad = 0, opcion = 0;
        boolean res = false;
        
        System.out.print("\nIngrese la cantidad a retirar:");
        cantidad = leer.nextInt();

        if (cantidad <= disponibilidad) {
            System.out.println("Ya puede tomar su dinero");
            System.out.println("Imprimiendo ticket");
            do {
                System.out.println("\nDesea realizar otra operacion? \n 1)Si \n 2)No");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Regresando al menu principal, un momento por favor");
                        res = true;
                        break;

                    case 2:
                        System.out.println("Gracias por su preferencia, que tenga un buen dia");
                        res = false;
                        break;
                
                    default:
                        System.out.println("Lo sentimos, opcion no valida para el sistema! \nIntentelo de nuevo");
                        break;
                }
            } while (opcion < 1 && opcion > 2);
            
        } else {
            System.out.println("Lo sentimos, dinero insuficiente");
            res = true;
        }

        return res;
        
    }

    public static boolean depositar(){
        Scanner leer = new Scanner(System.in);
        int cantidad = 0, opcion = 0;
        boolean res = false;

        System.out.print("\nIndique la cantidad que va a depositar:");
        cantidad = leer.nextInt();

        if (cantidad <= max_deposito) {
            System.out.println("Deposite el dinero por favor");
            System.out.println("Imprimiendo comprobante");
            do {
                System.out.println("\nDesea realizar otra operacion? \n 1)Si \n 2)No");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Regresando al menu principal, un momento por favor");
                        res = true;
                        break;

                    case 2:
                        System.out.println("Gracias por su preferencia, que tenga un buen dia");
                        res = false;
                        break;
                
                    default:
                        System.out.println("Lo sentimos, opcion no valida para el sistema! \nIntentelo de nuevo");
                        break;
                }
            } while (opcion < 1 && opcion > 2);
            
        } else {
            System.out.println("Lo sentimos, su deposito excede el maximo permitido");
            res = true;
        }

        return res;
    }
}