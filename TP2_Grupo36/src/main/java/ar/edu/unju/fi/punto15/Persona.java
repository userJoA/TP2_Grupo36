package ar.edu.unju.fi.punto15;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public int calcularEdad() {			
		LocalDate hoy = LocalDate.now();
		Period edad = Period.between(fechaNacimiento, hoy);
		return edad.getYears();
	}
	
	public String MostrarSigno() {
		String signo="";
		switch(fechaNacimiento.getMonthValue()) {
			case 1: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Capricornio" : "Acuario"; break; 
			case 2: signo = fechaNacimiento.getDayOfMonth() < 19 ? "Acuario" : "Piscis"; break;
			case 3: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Piscis" : "Aries"; break;
			case 4: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Aries" : "Tauro"; break;
			case 5: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Tauro" : "Géminis"; break;
			case 6: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Géminis" : "Cáncer"; break;
			case 7: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Cáncer" : "Leo"; break;
			case 8: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Leo" : "Virgo"; break;
			case 9: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Virgo" : "Libra"; break;
			case 10: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Libra" : "Escorpio"; break;
			case 11: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Escorpio" : "Sagitario"; break;
			case 12: signo = fechaNacimiento.getDayOfMonth() < 21 ? "Sagitario" : "Capricornio"; break;
			default: signo = "Fecha errónea"; break;
		}
		return signo;
	}
	
	public String verEstacion() {
		int mes = fechaNacimiento.getMonthValue();
		int dia = fechaNacimiento.getDayOfMonth();
		String estacion = "";
		if(mes==1 || mes==2 || mes==12 && dia>=21 || mes==3 && dia<21)
			estacion = "Verano";
		else if(mes==4 || mes==5 || mes==3 && dia>=21 || mes==6 && dia<21)
			estacion = "Otoño";
		else if(mes==7 || mes==8 || mes==6 && dia>=21 || mes==9 && dia<21)
			estacion = "Invierno";
		else if(mes==10 || mes==11 || mes==9 && dia>=21 || mes==12 && dia<21)
			estacion = "Primavera";
		else
			estacion = "Fecha errónea";
		return estacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
