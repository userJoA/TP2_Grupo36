package ar.edu.unju.fi.punto16;

import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero entero");
		//Se guarda el input dentro del scanner 
		Scanner numero=new Scanner(System.in);
		//se le asigna el dato del scanner al num
		int num=numero.nextInt();
		
		System.out.println("Numero: "+ num);
		//Instanciacion de la clase calculomatematico para usar el metodo productoria y sumatoria
		CalculoMatematico calculador= new CalculoMatematico(num);
		System.out.println( "Sumatoria: "+ calculador.calcularSumatoria() + " Productoria: " + calculador.calcularProductoria() );
		

	}

}
