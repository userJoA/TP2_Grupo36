package ar.edu.unju.fi.punto8;

public class Principal {

	/*
	 * Procedimiento para obtener la escala del 4, forma 1.
	 */
	public static void secuenciarx4() {
		int nro = 4;
		do {
			System.out.print(nro + " ");
			nro = nro + 4;
		}while(nro<=100);
	}
	
	/*
	 * Procedimiento para obtener la escala del 4, forma 2
	 */
//	public static void secuenciarx4() {
//		int nro = 1;
//		do {
//			System.out.print(4 * nro + " ");
//			nro++;
//		}while(nro<=25);
//	}
	
	
	/*
	 * Método Principal para ejecutar la aplicación del punto 8
	 */
	public static void main(String[] args) {
		System.out.println("Escala del 4");
		secuenciarx4();
	}

}
