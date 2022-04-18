package ar.edu.unju.fi.punto9;

/*
 * Clase del contador del punto 9
 * solo contiene procedimiento y no atributos
 */
public class Contador {
	
	/*
	 * Procedimiento para mostrar números en un rango dado de forma descendente de 20 en 20
	 */
	public void contarDescendenteFor(int nroSup, int nroInf) {		
		for(int i=nroSup; i>=nroInf; i=i-20) {
			System.out.println(i);
		}
	}

}
