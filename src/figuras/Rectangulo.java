package figuras;

public class Rectangulo {

	private double ancho;
	private double alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	public double getPerimetro() {
		return 2*(this.alto + this.ancho);
	}
}
