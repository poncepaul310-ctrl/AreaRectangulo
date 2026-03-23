/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author pc
 */
package semana.pkg14;

import java.util.Scanner;

public class Semana14 {

    public static double calcularArea(double ancho, double alto) {
        double area = ancho * alto;
        return area;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo del area de un rectangulo");

        System.out.print("Ingrese el ancho del rectangulo: ");
        double ancho = scanner.nextDouble();

        System.out.print("Ingrese el alto del rectangulo: ");
        double alto = scanner.nextDouble();

        double resultado = calcularArea(ancho, alto);

        System.out.println("El area del rectangulo es: " + resultado);

        scanner.close();
    }
}