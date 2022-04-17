package ar.edu.unju.fi.punto3;

import java.util.Scanner;

public class NumeroPar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador = 1;
		System.out.println("Ingrese un numero entero");
		do {
			
			System.out.println("N" + contador + " =");
			numero = sc.nextInt();
			if ( numero % 2 == 0 ){
				System.out.println("el numero " + numero + " es par");
			}
			contador++;
			
		} while (contador != 6);
		System.out.println("Cinco numeros ingresados. Fin de la aplicacion.");
	}
}
