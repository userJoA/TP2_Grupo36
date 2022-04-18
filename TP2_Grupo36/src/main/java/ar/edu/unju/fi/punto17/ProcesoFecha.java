package ar.edu.unju.fi.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
	/*atributos*/
	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dateTime1;
	private LocalDateTime dateTime2;
	
	/*constructores*/
	public ProcesoFecha() {
	}

	/**
	 * @param fecha1
	 * @param fecha2
	 */
	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	/**
	 * @param time1
	 * @param time2
	 */
	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}

	/**
	 * @param dateTime1
	 * @param dateTime2
	 */
	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	/*Getter and Setter*/
	
	/**
	 * @return the fecha1
	 */
	public LocalDate getFecha1() {
		return fecha1;
	}

	/**
	 * @param fecha1 the fecha1 to set
	 */
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	/**
	 * @return the fecha2
	 */
	public LocalDate getFecha2() {
		return fecha2;
	}

	/**
	 * @param fecha2 the fecha2 to set
	 */
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	/**
	 * @return the time1
	 */
	public LocalTime getTime1() {
		return time1;
	}

	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	/**
	 * @return the time2
	 */
	public LocalTime getTime2() {
		return time2;
	}

	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	/**
	 * @return the dateTime1
	 */
	public LocalDateTime getDateTime1() {
		return dateTime1;
	}

	/**
	 * @param dateTime1 the dateTime1 to set
	 */
	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	/**
	 * @return the dateTime2
	 */
	public LocalDateTime getDateTime2() {
		return dateTime2;
	}

	/**
	 * @param dateTime2 the dateTime2 to set
	 */
	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	/*Metodos*/
	
	public Period contarTiempoTranscurrido() {
		return Period.between(fecha1, fecha2);
	}
	
	public String formatearFecha(LocalDate fecha) {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formateador.format(fecha);
	}

	public String compararFechas() {
		
		/*LocalDate f1=LocalDate.parse(formatearFecha(this.fecha1));
		LocalDate f2=LocalDate.parse(formatearFecha(this.fecha2));*/
		
		if(fecha1.isAfter(fecha2)) {
			return "La fecha fecha1 es posterior a la fecha2";
		}else if(fecha1.isBefore(fecha2)) {
			return "La fecha1 es anterior a fecha2";
		}else {
			return "Ambas fechas son iguales";
		}
	}		
}
