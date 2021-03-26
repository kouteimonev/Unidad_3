package EXAMENUNIDAD;

public class mainExamen {
	
	public static void main(String[] args) {
		
		Punto punto1 = new Punto(532, 745);
		punto1.mostrarDatosP();
		System.out.println("\n\n");
		
		Circulo circulo1 = new Circulo(235, 966, 5);
		circulo1.mostrarDatosCr();
		System.out.println("\n\n");
		
		Cilindro cilindro1 = new Cilindro(412, 875, 5, 32);
		cilindro1.mostrarDatosCl();	
	}
}