package figuras;

public class Rectangulo {

	private double ancho;
	private double alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public double getPerimetro() {
		return 2*(this.alto + this.ancho);
	}
	
	public double getArea() {
		return this.alto * this.ancho;
	}

}
