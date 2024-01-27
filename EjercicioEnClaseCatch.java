package Entregable;

import java.util.Scanner;


public class EjercicioEnClaseCatch {

    public static void main(String[] args) {

        int num1,num2;
        Scanner scanner = new Scanner(System.in);

        //Hace el ingreso del primer dato
        System.out.println("Digite el primer numero");
        num1=scanner.nextInt();

        //Hace el ingreso del segundo dato
        System.out.println("Digite el segundo numero");
        num2=scanner.nextInt();


        try {
            // Código que podría lanzar una excepción
            int resultado = dividir(num1,num2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException error) {
            // Manejo de la excepción
            System.out.println("Error: División por cero no permitida."+error.getMessage());
        }catch (RuntimeException e2) {
            // Manejo de la excepción
            System.out.println("Error: División por cero no permitida."+e2.getMessage());
        }
        System.out.println("Termino Con exito: " );

        scanner.close();
    }
    // Método que realiza una división y puede lanzar una excepción
    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}