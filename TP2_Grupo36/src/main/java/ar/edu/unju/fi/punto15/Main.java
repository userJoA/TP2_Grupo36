package ar.edu.unju.fi.punto15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba Fecha de Nacimiento (dd/MM/yyyy): ");
		String fechaNac = teclado.next();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			LocalDate fecha = LocalDate.parse(fechaNac, formateador);
			persona.setFechaNacimiento(fecha);//carga de fecha correcta en Persona
		} catch (DateTimeParseException error) {
			System.out.println("Error: " + error.getMessage());
		}catch (Exception error) {
			System.out.println("Error 2: " + error.getMessage()); 
		}

		System.out.println("Edad " + persona.calcularEdad() + " años");
		System.out.println("Signo del zodiaco " + persona.MostrarSigno());
		System.out.print("Estación " + persona.verEstacion());

	}

}
