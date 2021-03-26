package EXAMENUNIDAD;

public class Cilindro extends Circulo {

	double volumen;
	
	public Cilindro() {}

	public Cilindro(double x, double y, double radio, double altura) {
		super(x, y, radio);
		super.altura = altura;
		super.area = areaCilindro();
		this.volumen = volumenCilindro();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double areaCilindro() {
		return ((super.areaCirculo()*2) + (super.perimetroCirculo()*this.altura));
	}
	
	public double volumenCilindro() {
		return (super.areaCirculo()*this.altura);
	}
	
	public void mostrarDatosCl() {
		super.mostrarDatosCr();
		System.out.println("Volumen: " + this.volumen);
	}
}