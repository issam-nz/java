public class Persona {
	String nombre;
	char genero;
	double peso;
	double altura;
	int edad;
	
	public Persona(String n, char g, double p, double a, int e) {
		nombre = n;
		genero = g;
		peso = p;
		altura = a;
		edad = d;
	}
	
	
	public boolean esMayorDeEdad() {
		return (edad >= 18) ; 
	}
	
	public boolean esMujer() {
		return genero == 'm';
	}
	
	public boolean esHombre() {
		return genero == 'h';
	}
	
	public boolean esOtroGenero() {
		return genero != 'h' && genero != 'm';
	}
	
	public void cambiarPeso(double cambio) {
		peso += cambio;
	}
	
	public void crecer(double cambio) {
		altura += cambio;
	}
	
}
