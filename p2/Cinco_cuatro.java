import java.util.Scanner;

public class Cinco_cuatro{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero = 0, division = 0, residuo = 0, restante = 0;
        String romano = "";
        boolean salir = false;

        System.out.println("Convertir numero a romano");

        do {

            System.out.print("Ingrese el numero a convertir: ");

            numero = leer.nextInt();

            if (numero > 0 && numero < 1000) {

                while (numero != 0) {

                    division = numero / 5;
                    //System.out.println("el resultado de la division es: " + division);
        
                    if (division >= 2) {
                        division = numero / 10;
                        //System.out.println("el resultado de la division es: " + division);
        
                        if (division >= 10) {
                            //Validacion para numeros MENORES que 1000
                            division = numero / 100;
                            //System.out.println("el resultado de la division es: " + division);
                            residuo = numero % 100;
                            //System.out.println("el residuo de la division es: " + residuo);
        
                            if (division == 9) {
                                romano = romano + "CM";
                                numero = numero - 900;
                            } else {
                                if (division == 4) {
                                    romano = romano + "CD";
                                    numero = numero - 400;
                                } else {
                                    if (division >= 5 && division < 9) {
                                        romano = romano + "D";
                                        numero = numero - 500;
                                        System.out.println(numero);
                                        division = division - 5;
                                        System.out.println(division);
                                    }
                                }
                            }
                                                
                            if (division > 0 && division < 4) {
                                for(int i = 0; i < division; i++){
                                    romano = romano + "C";
                                }
                                numero = numero - (division * 100);
                            }
        
                        } else {
                            //Validacion para numeros MENORES que 100
                            residuo = numero % 10;
                            //System.out.println("el residuo de la division es: " + residuo);
                            
                            if (division == 9) {
                                romano = romano + "XC";
                                numero = numero - 90;
                            } else {
                                if (division == 4) {
                                    romano = romano + "XL";
                                    numero = numero - 40;
                                } else {
                                    if (division >= 5 && division < 9) {
                                        romano = romano + "L";
                                        numero = numero - 50;
                                        System.out.println(numero);
                                        division = division - 5;
                                        System.out.println(division);
                                    }
                                }
                            }
                                                
                            if (division > 0 && division < 4) {
                                for(int i = 0; i < division; i++){
                                    romano = romano + "X";
                                }
                                numero = numero - (division * 10);
                            }
                        }
        
                    } else {
                        //Validacion para numeros MENORES que 10
                        residuo = numero % 5;
                        //System.out.println("el residuo de la division es: " + residuo);
        
                        if (division == 1 && residuo > 3) {
                            romano = romano + "IX";
                            numero = numero - 9;
                        } else {
                            if (division == 0 && residuo == 4) {
                                romano = romano + "IV";
                                numero = numero - 4;
                            } else {
                                if (division == 1 ) {
                                    romano = romano + "V";
                                    numero = numero - (division * 5);
                                }
                            }
                        }
                        /* if (division == 1) {
                            
                        } */
                        
                        if (residuo > 0 && residuo < 4) {
                            for(int i = 0; i < residuo; i++){
                                romano = romano + "I";
                            }
                            numero = numero - residuo;
                        }
                    }
        
                    //residuo = numero % 5;
                    //System.out.println("el residuo de la division es: " + residuo);
                    
                }
        
                System.out.println(romano);

                salir = true;
                
            } else {
                System.out.println("Lo sentimos ese valor no es valido para el sistema, intentelo de nuevo");
            }
            
        } while (salir == false);

    }
}