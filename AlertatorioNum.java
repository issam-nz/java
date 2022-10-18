public class NumSecreto {

    private int NumAler;
    private int intentos;
    private final int intentosMax = 3;


    public NumSecreto() {
        NumAler = (int) (Math.random()*100) +1;
    }

    public boolean esExito(int x) {
        return NumAler == x;
    }

    public String pista(int x) {

        if (x > NumAler) {
            return "mayor";
        } else {
            return "menor";
        }
    }

    public String resultado(int x) {
        String mensaje = "";
        while (intentos <= intentosMax) {
            if (esExito(x)) {
                mensaje = "exito";
                break;
            } else {
                intentos += 1;
                return pista(x);
            }

        }

    }
}
//if (NumAler < 10) {} else if (NumAler > 90) {} else {// 10 < num < 90}