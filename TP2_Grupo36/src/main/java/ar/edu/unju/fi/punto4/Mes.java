package ar.edu.unju.fi.punto4;

import java.util.Scanner;

public class Mes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			
			System.out.println("Ingrese un numero entero");
			numero = sc.nextInt();
			if ( numero == 1){
				System.out.println("es Enero");
			}
			else {
				if ( numero == 2){
					System.out.println("es Febrero");
				}
				else {
					if ( numero == 3){
						System.out.println("es Marzo");
					}
					else {
						if ( numero == 4){
							System.out.println("es Abril");
						}
						else {
							if ( numero == 5){
								System.out.println("es Mayo");
							}
							else {
								if ( numero == 6){
									System.out.println("es Junio");
								}
								else {
									if ( numero == 7){
										System.out.println("es Julio");
									}
									else {
										if ( numero == 8){
											System.out.println("es Agosto");
										}
										else {
											if ( numero == 9){
												System.out.println("es Septiembre");
											}
											else {
												if ( numero == 10){
													System.out.println("es Octubre");
												}
												else {
													if ( numero == 11){
														System.out.println("es Noviembre");
													}
													else {
														if ( numero == 12){
															System.out.println("es Diciembre");
														}
														else {
															System.out.println("No existe ese mes. Se finaliza el ingreso.");
															}
													}
														
												}
											}
										}
								
									}
								}
							}
						}
					}
				}
			}

			
		} while (numero >=1 && numero < 13);
		
	}
}
