package ar.edu.unju.fi.punto2;

import java.util.Scanner;

public class mainAnioBisiesto {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un año");
		//guarda el input del usuario en un scanner
		Scanner scanner=new Scanner(System.in);
		//Guarda el input en un entero
		int anio=scanner.nextInt();
		if((anio%4==0 && anio%100!=0) || anio%400==0) {
			System.out.println("El anio: "+anio+" es bisiesto");
		}else {
			System.out.println("El "+anio+" No es un anio bisiesto");
		}
	}

}
