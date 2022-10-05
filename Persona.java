public class Persona {
	String nombre;
	int edad;
	char genero;
	double peso;
	double altura;
	
	public Persona(String n, int e, char g, double p, double a) {
		nombre = n;
		edad = e;
		genero = g;
		peso = p;
		altura = a;
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
	
	public double calcularIMC() {
		return (peso / (Math.pow(altura, 2)));
	}
	
	public boolean enForma() {
		return (calcularIMC() > 18.5 && calcularIMC() < 24.9);
	}
	
	public String mostrarForma() {
		String s;
		if (calcularIMC() < 18.5)
			s = "Delgado/a";
		else if (calcularIMC() > 18.5 && calcularIMC() < 24.9 )
			s = "En forma";
		else 
			s = "Sobrepeso";
		return s;
	}
	
	public void cambiarGenero(char g) {
		genero = g;
	}
	
	public void cumpleanos() {
		edad += 1;
	}
	
	public int mostrarEdad() {
		return edad;
	}
}
