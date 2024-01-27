package Entregable;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        int num1,num2,resultadoSuma=0, resultadoResta=0, resultadoMultipli=0, resultadoDivi=0;

        Scanner scanner = new Scanner(System.in);

        //Hace el ingreso del primer dato
        System.out.println("Digite el primer numero");
        num1=scanner.nextInt();

        //Hace el ingreso del segundo dato
        System.out.println("Digite el segundo numero");
        num2=scanner.nextInt();

        resultadoSuma=num1+num2;
        resultadoResta=num1-num2;
        resultadoMultipli=num1*num2;
        resultadoDivi=num1/num2;

        System.out.println("El resultado de la operacion es: " + resultadoSuma);
        System.out.println("El resultado de la operacion es: " + resultadoResta);
        System.out.println("El resultado de la operacion es: " + resultadoMultipli);
        System.out.println("El resultado de la operacion es: " + resultadoDivi);
        scanner.close();
    }
}
