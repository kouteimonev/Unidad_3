package EXAMENUNIDAD;

public class Circulo extends Punto{

	double radio, perimetro, area, altura=0;

	public Circulo() {}

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
		this.area = areaCirculo();
		this.perimetro = perimetroCirculo();
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double areaCirculo() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double perimetroCirculo() {
		return (radio*2)*Math.PI;
	}
	
	public void mostrarDatosCr() {
		super.mostrarDatosP();
		System.out.println("Radio: " + this.radio);
		System.out.println("Perimetro: " + this.perimetro);
		System.out.println("Altura: " + this.altura);
		System.out.println("Area: " + this.area);
	}
}