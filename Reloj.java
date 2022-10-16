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

    //setter de hora
    private int setHora(int hora) {
        if (hora > 23)
            return 23;
        else if (hora < 0)
            return 0;
        else
            return hora;
    }

    //setter de minutos
    private int setMinutos(int minutos) {
        if (minutos > 59)
            return 59;
        else if (minutos < 0)
            return 0;
        else
            return minutos;
    }

    //setter de segundos
    private int setSegundos(int segundos) {
        if (segundos > 59)
            return 59;
        else if (segundos < 0)
            return 0;
        else
            return segundos;
    }

    // Dame hora sin parametros
    public int dameHora() {
        return (hora +":"+ minutos +":"+ segundos);
    }

    // Dame hora con parametro : formato
    public String dameHora(byte formato) {
        // devolver la hora como String (hh:mm:ss)
        // parametro tiene dos posibilidades si formato no es igual a ningula de los dos, devuelva un String "invalid"
        if (formato == 12) {
            String am_pm; //am o pm
            int hf; // hora formato - se cambia si la hora es mayor q 12 - sino igual a la hora normal
            if (hora < 12) {
                am_pm = "am";
                hf = hora;
            } else if (hora > 11) {
                am_pm = "pm";
                if (hora != 12) {
                    // si es las 12 no cambiamos nada
                    hf = hora;
                } else {
                    hf = hora - 12;
                }
            }
            return (hf + ":" + minutos + ":" + segundos + am_pm);
        } else if (formato == 24) {
            return (hora +":"+ minutos +":"+ segundos);
        } else
            return "invalid format";
    }
}
