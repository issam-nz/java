import java.util.Random;

public class Contrasena {
    private String textoContrasena;
    private char[] listaChar = {32, 33, 34, 35, 36, 37, 38, 40, 41, 42,
            43, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56,
            57, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
            72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102,
            103, 104, 105, 106, 107, 108, 109, 110, 111, 112,
            113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    public Contrasena(int longtitud) {
        textoContrasena = randomPass(longtitud);
    }

    public char randomChar(char[] lis) {
        // Devuelva un character aleratorio de un array
        // necesita un array de characteres como parametro
        int rnd = new Random().nextInt(lis.length);
        return (char) lis[rnd];
    }

    //contraseña aleratoria
    public String randomPass(int l) {
        String txt = "";
        for (int i = 0; i < l; i++) {
            txt += randomChar(listaChar);
        }
        return txt;
    }

    public boolean esFuerte() {
        return (textoContrasena.length() >= 8);
    }

    public void cambiarContrasena() {
        textoContrasena = randomPass(8);
    }

    public void cambiarContrasena(int longtitud) {
        textoContrasena = randomPass(longtitud);
    }

    public String  mostrarContrasena(){
        return textoContrasena;
    }
}
//----------------------------------------
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Contrasena pass1 = new Contrasena(6);
        System.out.println(pass1.mostrarContrasena());
        if (pass1.esFuerte())
            System.out.println("es fuerte");
        else
            System.out.println("no es fuerte");
        pass1.cambiarContrasena(12);
        System.out.println(pass1.mostrarContrasena());
        if (pass1.esFuerte())
            System.out.println("es fuerte");
        else
            System.out.println("no es fuerte");


        System.out.println("Contraseña: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String entrada = reader.readLine();

        if (entrada == pass1.mostrarContrasena())
            System.out.println("Contraseña correcta");
        else
            System.out.println("Contraseña incorrecta");

        // siempre incorrecta no se porq
    }
}
//lo que queria hacer es una lista de 0-9 a-z y A-7 y .+=/!%&$€
// por ejemplo ascii code(65 -> 90 y 97 -> 122 ....)