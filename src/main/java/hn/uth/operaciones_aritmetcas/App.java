package hn.uth.operaciones_aritmetcas;

import java.util.Scanner;

public class App 
{
	private static Scanner teclado;
	
    public static void main( String[] args )
    {
    	System.out.println( "Calculadora de Areas, Figuras Geometricas" );
        int opcion=0;


        while(opcion!=5) {
            Menu();
            opcion= leerEnteroTeclado("");
            
            Double respuesta=null;
            
            if (opcion==1) {
            respuesta=acirculo(leerDecimalTeclado("Ingrese el radio del circulo: "));
            }
            else if (opcion==2) {
                respuesta=acuadrado(leerDecimalTeclado("Ingrese la medida del lado: "));
            }
            else if (opcion==3) {
                respuesta=arectangulo(leerDecimalTeclado("Ingrese la medida del lado a: "),leerDecimalTeclado("Ingrese la medida del lado b:"));
            }
            else if (opcion==4) {
                respuesta=atriangulo(leerDecimalTeclado("Ingrese la medida de la base: "),leerDecimalTeclado("Ingrese la medida de la altura:"));
            }
            else {
                System.out.println("---------------------------------------");
                System.out.println("Gracias por utilizar la aplicación.");
                System.out.println("---------------------------------------");
                break;
            }
            
            System.out.println("El resultado de la operación es: "+respuesta);

        }
 
    }
    
    private static int leerEnteroTeclado(String mensaje) {
	    teclado = new Scanner(System.in);
	    System.out.println(mensaje);
	    return teclado.nextInt();
	}

	private static double leerDecimalTeclado(String mensaje) {
	    teclado = new Scanner(System.in);
	    double numero = -1;

	    System.out.println(mensaje);
	    numero = teclado.nextDouble();

	    while (numero < 0) {
	        System.out.println("Los números negativos no son validos. Inténta de nuevo.");
	        System.out.println(mensaje);
	        numero = teclado.nextDouble();
	    }
	    return numero;
	}

	 
	 private static void Menu() {
		 System.out.println("-------------------------------");
	     System.out.println("     MENU DE OPCIONES     ");
	     System.out.println("-------------------------------");
	     System.out.println("1. Área de un círculo");
	     System.out.println("2. Área de un cuadrado");
	     System.out.println("3. Área de un rectángulo");
	     System.out.println("4. Área de un triángulo");
	     System.out.println("5. Salir");
	     System.out.println("-------------------------------");
	     System.out.println("ELIGE UNA OPCIÓN DEL MENÚ:");
	     System.out.println("-------------------------------");

	 }

	public static double acirculo(double radio) 
	{
		double resultado=0;
	     resultado=3.1416*(radio*radio);
	     return resultado;

	}
	public static double acuadrado(double lado) 
	{
		double resultado=0;
	     resultado=(lado*lado);
	     return resultado;

	}
	public static double arectangulo(double ladoa, double ladob) 
	{
		double resultado=0;
	     resultado=ladoa*ladob;
	     return resultado;

	}
	public static double atriangulo(double base, double altura) 
	{
		double resultado=0;
	     resultado=(base*altura)/2;
	     return resultado;

	}

}


