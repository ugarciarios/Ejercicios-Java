package Entregable;


import java.util.Scanner;

//Calcular el promedio de 5 datos agragados, notas de 1 a 5
public class Ejercicio3 {

    public static void main(String[] args) {
        double[] ordename=new double[5];

        double contador=0;
        Scanner scanner = new Scanner(System.in);

        for (int i =0;i<ordename.length;i++){
            System.out.print("Ingrese su Nota");
            ordename[i]=scanner.nextDouble();
        }

        for (int i =0;i<ordename.length;i++){
            contador= contador+ordename[i];
        }

        System.out.println("Su promedio es de: " + contador/ordename.length);
    }
}
