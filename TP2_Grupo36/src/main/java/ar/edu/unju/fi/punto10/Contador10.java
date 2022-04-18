package ar.edu.unju.fi.punto10;

/*
 * Clase del contador del punto 10
 * Contiene el procedimiento contar y dos atributos, los extremos del rango de nros.
 */
public class Contador10 {
	
	/*
	 * Atributo de tipo entero que indica el máximo nro del rango de nros.
	 */
	private int nroSup;
	
	/*
	 * Atributo de tipo entero que indica el mínimo nro del rango de nros.
	 */
	private int nroInf;
	
	
	/*
	 * Procedimiento que muestra el rango de nros de forma descendente
	 * de 20 en 20, con While
	 */
	public void contarDescendenteWhile() {
		int contador = this.nroSup;
		while(contador >= this.nroInf) {
			System.out.println(contador);
			contador = contador-20;			
		}
	}

	public int getNroSup() {
		return nroSup;
	}

	public void setNroSup(int nroSup) {
		this.nroSup = nroSup;
	}

	public int getNroInf() {
		return nroInf;
	}

	public void setNroInf(int nroInf) {
		this.nroInf = nroInf;
	}		

}
