package ar.edu.unju.fi.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.now(), LocalDate.of(2022, 4, 11));
		System.out.println("Fecha 1: "+pf1.getFecha1());
		System.out.println("Fecha 2: "+pf1.getFecha2());
		
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(22, 30), LocalTime.of(22, 30));
		System.out.println("Time 1 "+pf2.getTime1());
		System.out.println("Time 2 "+pf2.getTime2());
		LocalTime time1MasHoras = pf2.getTime1().plusHours(5);
		System.out.println("Time 1 + 5 horas: "+time1MasHoras);
		LocalTime time2MenosMinutos = pf2.getTime2().minusMinutes(20);
		System.out.println("TIme 2 - 20 minutos: "+time2MenosMinutos);
		
		System.out.println(pf1.compararFechas());
		
		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(pf1.getFecha1(), pf2.getTime1()), LocalDateTime.of(pf1.getFecha2(), pf2.getTime2()));
		System.out.println(pf3.getDateTime1());
		System.out.println(pf3.getDateTime2());
		
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(1994, 1, 4), LocalDate.now());
		System.out.println("Han transcurrido "+pf4.contarTiempoTranscurrido().getYears()+" años, "+pf4.contarTiempoTranscurrido().getMonths()+ " meses y "+
		pf4.contarTiempoTranscurrido().getDays()+ " días desde la fecha "+pf4.getFecha1()+" hasta la fecha "+pf4.getFecha2());	
		
		Scanner teclado = new Scanner(System.in);
		Boolean bandera=true;
		do {
			System.out.println("Ingresar una fecha(dd/MM/yyyy): "); 
			String fechaStr = teclado.next();
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				LocalDate fecha3 = LocalDate.parse(fechaStr, formateador);
				System.out.println(fecha3); 
				System.out.println(formateador.format(fecha3));
				bandera=true;
			} catch (DateTimeParseException e) 
			{ System.out.println("Fecha Incorrecta" +e.getMessage()); 
			  bandera=false;
			}
			catch (Exception e) { System.out.println(e.getMessage()); 
			}
		}while(bandera==false);
		
		ProcesoFecha pf5 = new ProcesoFecha();
		pf5.setFecha1(LocalDate.of(2020, 2, 10));
		LocalDate fechaIncrementada = pf5.getFecha1().plusDays(365);
		System.out.println("Fecha incrementada: "+fechaIncrementada);
		pf5.setFecha2(LocalDate.of(2020, 1, 10));
		LocalDate fechaDecremento = pf5.getFecha2().minusMonths(6);
		System.out.println("Fecha Decrementada: "+fechaDecremento);
	}

}
