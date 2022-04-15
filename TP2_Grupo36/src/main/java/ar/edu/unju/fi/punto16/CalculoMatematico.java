package ar.edu.unju.fi.punto16;

public class CalculoMatematico {
	int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}
	
	public double calcularSumatoria() {
		int i;
		double suma=0;
		for(i=1 ;i<=this.n;i++) {
			suma+=Math.pow(((i*(i+1))/2), 2);
		}
		return suma;
			
	}
	
	public int calcularProductoria(){
		int i, productorial=1;
		for(i=1;i<=this.n;i++) {
			productorial*=i*(i+4);
		}
		return productorial;
	}
}
