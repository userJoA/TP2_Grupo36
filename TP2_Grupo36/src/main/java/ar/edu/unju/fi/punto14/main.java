package ar.edu.unju.fi.punto14;

import java.time.LocalDate;

import ar.edu.unju.fi.punto14.Empleado;

public class main {

	public static void main(String[] args) {
		//Ejemplo del ejercicio resuelto
		Empleado empleado= new Empleado("alfonso", 2015, 5, 22, "a442", "Empleado@gmail.com", 161);
		System.out.println(empleado.toString());
		
		
		Empleado empleado1 = new Empleado();
		System.out.println(empleado1.toString());
		
		Empleado empleado2 = new Empleado("Jose", "2900", 8);
		System.out.println(empleado2.toString());
		
		Empleado empleado3 = new Empleado("David", LocalDate.now(), 6);
		System.out.println(empleado3.toString());
		
		Empleado empleado4 = new Empleado("Enzo", 12);
		System.out.println(empleado4.toString());

	}

}
