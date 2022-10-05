
public class testPersona {

	public static void main(String[] args) {
		// objeto Sara
		Persona persona1 = new Persona("Sara", 16, 'm', 52, 1.68);
		System.out.println(persona1.enForma() ? "Esta en forma" : "No esta en forma");
		persona1.cambiarPeso(5);
		System.out.println("IMC: " + String.format("%.2f", persona1.calcularIMC()));
		persona1.cumpleanos();
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("edad: " + persona1.edad);
		
		System.out.println();
		// objeto John
		Persona persona2 = new Persona("John", 14, 'h', 76, 1.72);
		System.out.println("Esta: " + persona2.mostrarForma());
		System.out.println("IMC: " + String.format("%.2f", persona2.calcularIMC()));
		
		persona2.cambiarGenero('m');
		persona2.nombre = "Jessica";
		persona2.cambiarPeso(-4);
		System.out.println("Esta: " + persona2.mostrarForma());
		System.out.println("IMC: " + String.format("%.2f", persona2.calcularIMC()));
		
	}

}
