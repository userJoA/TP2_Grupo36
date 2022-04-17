package ar.edu.unju.fi.punto1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int factorial = 1;
		do {
			System.out.println("Ingrese un numero entre el 0 al 10");
			
			numero = sc.nextInt();
			
		} while (numero < 0 || numero >10);
		
		if (numero == 0) {
			System.out.println(numero +"! = " +factorial);
		}
		else {
			int aux=numero;
			while (numero > 0) {
				factorial = factorial * numero;
				numero--;
			}
			System.out.println(aux +"! = " +factorial + " ¡Fin de la aplicacion!");
		}
	}
}