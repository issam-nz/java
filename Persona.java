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
		edad = e;
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
