package ar.edu.unju.fi.punto6;

import java.util.Scanner;

public class EstadoDeAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
	
			
			System.out.println("Ingrese un numero entero");
			numero = sc.nextInt();
			while (numero > 0 && numero < 11) {
				if (numero >=7) {
					System.out.println("El alumno promociona");
				}
				else {
					if (numero == 6) {
						System.out.println("Alumno regulariza");
					}
					else {
						System.out.println("El alumno desaprueba");
					}
					}
				System.out.println("Ingrese un numero entero");
				numero = sc.nextInt();
				}
			System.out.println("Valor no permitido. Fin de la aplicacion");
		}
}
