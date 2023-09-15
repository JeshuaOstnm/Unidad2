/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_de_monedas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora_de_monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en pesos mexicanos");
        double pesos = lectura.nextDouble();
        
        double euros = 18.28;
        double dolares = 17.07;
        double yen = 0.12;
        double libras = 21.18;
        
        System.out.println("La cantidad de pesos en Eurosa es: " + pesos/euros);
        System.out.println("La cantidad de pesos en Dolares es: " + pesos/dolares);
        System.out.println("La cantidad de pesos en Yen es: " + pesos/yen);
        System.out.println("La cantidad de pesos en Libras es: " + pesos/libras);
        
        lectura.close();
    }
}
