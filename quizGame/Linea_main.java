import javax.swing.*;

public class Linea {
    String p;     //La pregunta
    String ra;    //respuesta 1
    String rb;    //respuesta 2
    String rc;    //respuesta 3
    String rd;    //respuesta 4
    int n; //respuesta correcta (numero de la respuesta - de 0 a 4)

    // Cada linea tiene una pregunta, opciones o respuestas(ra, rb, rc, rd) y la respuesta correcta

    //Constructor
    public Linea(String p, String a, String b, String c ,String d,int n) {
        this.p = p;
        this.ra = a;
        this.rb = b;
        this.rc = c;
        this.rd = d;
        this.n = n;
    }

    public String[] opciones() {
        // Devuelve una lista de respuestas (Array of String)
        String [] listaRep = {this.ra, this.rb, this.rc, this.rd};
        return listaRep;
    }
}


// ---------------------------------------------------------------------------------
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        // instanciar la clase con lineas
        //linea 1
        Linea l1 = new Linea("¿En que año aparecio el lenguaje Java?",
                "1985", "1996", "2000", "1995", 1);
        //linea 2
        Linea l2 = new Linea("¿Como se define una clase en Java?",
                "class", "function", "String", "while", 0);
        //linea 3
        Linea l3 = new Linea("¿Qué significa instanciar una clase?",
                "Duplicar una clase", "Eliminar una clase", "Conectar dos clases", "Crear un objeto", 3);
        //linea 4
        Linea l4 = new Linea("¿Qué es Eclipse?",
                "Una libreria de Java", "Una versión de Java", "Un IDE", "Ninguna de las anteriores", 2);

        // poner las líneas en una lista
        Linea[] lineas = {l1, l2, l3, l4};

        // Contador de puntos
        int puntos = 0;
        int entrada;

        for (int i = 0; i < lineas.length; i++) {
            // Titulo de la pantalla
            String title = "Pregunta " + (i + 1);

            entrada = JOptionPane.showOptionDialog(null, lineas[i].p, title,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, lineas[i].opciones(), lineas[i].opciones()[0]);

            // Control de entrada, si el usuoario no ha eligido nada
            while (entrada == -1) {
                JOptionPane.showMessageDialog(null, "Tienes que elegir una opción");
                entrada = JOptionPane.showOptionDialog(null, lineas[i].p, title,
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, lineas[i].opciones(), lineas[i].opciones()[0]);
            }

            // Aumentar un punto si la respuesta es correcta
            if (entrada == lineas[i].n)
                puntos++;
        }

        JOptionPane.showMessageDialog(null, ("Tu puntaje es: \n" + puntos + "/" +lineas.length));

    }
}
