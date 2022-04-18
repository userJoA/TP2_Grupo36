package ar.edu.unju.fi.punto10;

public class Principal10 {

	public static void main(String[] args) {
		
		Contador10 contador = new Contador10();
		contador.setNroSup(320);//Se carga por setter
		contador.setNroInf(160);
		contador.contarDescendenteWhile();

	}

}
