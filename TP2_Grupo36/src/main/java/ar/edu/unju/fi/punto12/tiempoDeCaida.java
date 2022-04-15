package ar.edu.unju.fi.punto12;

public class tiempoDeCaida {
	//Atributos
	float h;
	//Constructor
	public tiempoDeCaida(float h) {
		super();
		this.h = h;
	}

	//Metodo que implemeta sqrt()
	public double tiempo() {
		double tiempo=Math.sqrt((2*h/9.81));
		return tiempo;
	}
}
