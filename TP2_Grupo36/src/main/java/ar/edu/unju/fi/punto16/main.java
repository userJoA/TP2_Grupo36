package ar.edu.unju.fi.punto16;

import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero entero");
		Scanner numero=new Scanner(System.in);
		int num=numero.nextInt();
		
		System.out.println("Numero: "+ num);
		CalculoMatematico calculador= new CalculoMatematico(num);
		System.out.println( "Sumatoria: "+ calculador.calcularSumatoria() + " Productoria: " + calculador.calcularProductoria() );
		

	}

}
