public class Linea {
    String p;     //Pregunta
    String ra;    //respuesta a
    String rb;    //respuesta b
    String rc;    //respuesta c
    String rd;    //respuesta d
    int n; //respuesta correcta (numero)

    public Linea(String p, String a, String b, String c ,String d,int n) {
        this.p = p;
        this.ra = a;
        this.rb = b;
        this.rc = c;
        this.rd = d;
        this.n = n;
    }

    public String lineaString() {
        return  this.p + "\n" +
                "1: " + this.ra + "\n" +
                "2: " + this.rb + "\n" +
                "3: " + this.rc + "\n" +
                "4: " + this.rd;
    }

    public String[] opciones() {
        String [] listaRep = {this.ra, this.rb, this.rc, this.rd};
        return listaRep;
    }
}

// ---------------------------------------------------------------------------------
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        // intialize las lineas
        Linea l1 = new Linea("que1", "aaa1", "bbb1", "ccc1", "ddd1", 1);
        Linea l2 = new Linea("que2", "aaa2", "bbb2", "ccc2", "ddd2", 0);
        Linea l3 = new Linea("que3", "aaa3", "bbb3", "ccc3", "ddd3", 3);
        Linea l4 = new Linea("que4", "aaa4", "bbb4", "ccc4", "ddd4", 2);

        // make the lines(questions and respuestas) en una lista
        Linea [] lineas = {l1, l2, l3, l4};
        int puntos = 0;
        int entrada;

        // la linea completa de un formato string
        // better maek this linea como __repr__ de la clase, seria mejor
//        String lineaString;

        for (int i = 0; i < lineas.length; i++) {

            String msg = "Pregunta " + (i+1) + lineas[i].p;
            String title = "Pregunta " + (i + 1);
            entrada = JOptionPane.showOptionDialog(null, msg, title,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, lineas[i].opciones(), lineas[i].opciones()[0]);

            if (entrada == lineas[i].n)
                puntos++;
        }
        JOptionPane.showMessageDialog(null, ("tu puntaje es: \n" + puntos + "/" +lineas.length));
    }
}

