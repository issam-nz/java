public class Reloj {

    private int hora;
    private int minutos;
    private int segundos;

    public Reloj () {
        hora = 0;
        minutos = 0;
        segundos = 0;
    }

    public Reloj (int h, int m, int s) {
        hora = setHora(h);
        minutos = setMinutos(m);
        segundos = setSegundos(s);
    }

//    public void CompruebaHora(int ho, int mi, int seg) {
//        this.hora = ho;
//        this.minutos = mi;
//        this.segundos = seg;
//    }

    //setter de hora
    private int setHora(int hora) {
        int h;
        if (hora > 24)
            h = 24;
        else if (hora < 0) {
            h = 0;
        } else
            h = hora;
        return h;
    }

    //setter de minutos
    private int setMinutos(int minutos) {
        int m;
        if (minutos > 59)
            m = 60;
        else if (minutos < 0) {
            m = 0;
        }
        else
            m = minutos;
        return m;
    }

    //setter de segundos
    private int setSegundos(int segundos) {
        int s;
        if (segundos > 59)
            s = 60;
        else if (segundos < 0) {
            s = 0;
        }
        else
            s = segundos;
        return s;
    }
//    public int dameHora(int formato) {
//
//        return hora;
//    }
}
