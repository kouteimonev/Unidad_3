package EXAMENUNIDAD;

public class Punto {

	double x, y;
	public Punto() {}
	
	public Punto(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void mostrarDatosP() {
		System.out.println("Coordenada x: " + this.x);
		System.out.println("Coordenada y: " + this.y);
	}
}
