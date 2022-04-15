package ar.edu.unju.fi.punto13;

import java.time.LocalDate;

public class Empleado {
	//Atributos de la clase
	private String Nombre;
	private LocalDate fechaIngreso;
	private String Legajo;
	private String Email;
	private float Sueldo;
	private float horasTrabajadas;
	
	
	//Constructor de la clase
	public Empleado(String nombre, int anioIngreso,int mesIngreso,int diaIngreso, String legajo, String email, 
		float horasTrabajadas) {
		super();
		Nombre = nombre;
		this.fechaIngreso=LocalDate.of(anioIngreso, mesIngreso, diaIngreso);
		Legajo = legajo;
		Email = email;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//metodo para calcular sueldo
	public float Sueldo() {
		float sueldo=0;
		if(this.horasTrabajadas>160)
			sueldo=160*600+(this.horasTrabajadas-160)*650;
		else
			sueldo=this.horasTrabajadas*600;
		
		return sueldo;
	}

	//metodo To String para imprimir los atributos de la clase
	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", fechaIngreso=" + fechaIngreso + ", Legajo=" + Legajo + ", Email="
				+ Email + ", horasTrabajadas=" + horasTrabajadas +" ,Sueldo="+ this.Sueldo()+ "]";
	}
	
	
}
