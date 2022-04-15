package ar.edu.unju.fi.punto16;

public class CalculoMatematico {
	//Atributos
	int n;
	//Getters y setters
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	//Constructor
	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}
	//Sumatoria
	public double calcularSumatoria() {
		int i;
		double suma=0;
		for(i=1 ;i<=this.n;i++) {
			suma+=Math.pow(((i*(i+1))/2), 2);
		}
		return suma;
			
	}
	//productoria
	public int calcularProductoria(){
		int i, productorial=1;
		for(i=1;i<=this.n;i++) {
			productorial*=i*(i+4);
		}
		return productorial;
	}
}
