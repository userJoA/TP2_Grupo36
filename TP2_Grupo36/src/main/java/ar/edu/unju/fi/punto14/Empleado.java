package ar.edu.unju.fi.punto14;

import java.time.LocalDate;

public class Empleado {
	/*Constructores*/
	private String Nombre;
	private LocalDate fechaIngreso;
	private String Legajo;
	private String Email;
	private float Sueldo;
	private float horasTrabajadas;
	
	
	/*Constructores*/
	
	public Empleado(String nombre, int anioIngreso,int mesIngreso,int diaIngreso, String legajo, String email, 
		float horasTrabajadas) {
		super();
		Nombre = nombre;
		this.fechaIngreso=LocalDate.of(anioIngreso, mesIngreso, diaIngreso);
		Legajo = legajo;
		Email = email;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nombre
	 * @param legajo
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, String legajo, float horasTrabajadas) {
		super();
		fechaIngreso=LocalDate.of(1900, 1, 1);
		Nombre = nombre;
		Legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	/**
	 * @param nombre
	 * @param fechaIngreso
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, LocalDate fechaIngreso, float horasTrabajadas) {
		super();
		Nombre = nombre;
		Legajo="-9999";
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
	}

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, float horasTrabajadas) {
		super();
		fechaIngreso=LocalDate.of(1900, 1, 1);
		Nombre = nombre;
		Legajo="-9999";
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
		return "Nombre de Empleado: " + Nombre + ", FechaIngreso: " + fechaIngreso + ", Legajo: " + Legajo + ", Email: "
				+ Email + ", horasTrabajadas: " + horasTrabajadas +" , Sueldo: "+ this.Sueldo();
	}
	
	
}
