package ar.edu.unju.fi.punto12;

import java.util.Scanner;

public class mainTiempoCaida {

	public static void main(String[] args) {
		
		System.out.println("Ingrese una altura en metros");
		Scanner scanner=new Scanner(System.in);
		float altura=scanner.nextInt();
		//Instanciacion de la clase
		tiempoDeCaida tiempo = new tiempoDeCaida(altura);
		System.out.println("Tiempo en (seg): "+tiempo.tiempo()+"s");
	}

}
