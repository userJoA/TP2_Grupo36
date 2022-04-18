package ar.edu.unju.fi.punto11;

/*
 * Clase Contador del punto 11
 * contiene un constructor con 2 atributos, los nros extremos del rango
 */
public class Contador11 {
	
	private int nroMax;
	private int nroMin;
	
		
	public Contador11(int nroMax, int nroMin) {
		super();
		this.nroMax = nroMax;
		this.nroMin = nroMin;
	}


	/*
	 * Procedimiento que muestra nros en un rango, de forma descendente
	 * de 20 en 20 usando Do While y sin parámetros
	 */
	public void contarDescendenteDoWhile() {
		int contador = nroMax;
		do {
			System.out.print(contador + " ");
			contador -= 20; //contador=contador-20;
		}while(contador>=nroMin);
	}

}
