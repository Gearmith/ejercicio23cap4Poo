/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio23cap4poo;
import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio23cap4Poo {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("INGRESE EL VALOR DE A: ");
	double valA = entrada.nextDouble();
	System.out.println("INGRESE EL VALOR DE B: ");
	double valB = entrada.nextDouble();
	System.out.println("INGRESE EL VALOR DE C: ");
	double valC = entrada.nextDouble();

        double discr = valB * valB - 4 * valA * valC;

        if (discr >= 0) {
            double raizMas = (-valB + Math.sqrt(discr)) / (2 * valA);
            double raizMenos = (-valB - Math.sqrt(discr)) / (2 * valA);
            System.out.println("SOLUCION 1 = " + raizMas);
            System.out.println("SOLUCION 2 = " + raizMenos);
        } else {
            System.out.println("NO TIENE SOLUCIONES REALES");
        }
    }
}
