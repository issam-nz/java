import java.util.Scanner;

public class NumSecreto {

    private int NumAler;
    private int intentos;
    private final int intentosMax = 3;


    public NumSecreto() {
        NumAler = (int) (Math.random()*100) +1;
    }
//
//    public boolean esExito(int x) {
//        return NumAler == x;
//    }
//
//    public String pista(int x) {
//
//        if (x > NumAler) {
//            return "mayor";
//        } else {
//            return "menor";
//        }
//    }
//
//    public String resultado(int x) {
//        String mensaje = "";
//        while (intentos <= intentosMax) {
//            if (esExito(x)) {
//                mensaje = "exito";
//                break;
//            } else {
//                intentos += 1;
//                return pista(x);
//            }
//
//        }
//
//    }
//if (NumAler < 10) {} else if (NumAler > 90) {} else {// 10 < num < 90}


//-----------------------------
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            int numSecreto = (int) (Math.random()*100) +1;
            int intentos = 0;
            int intentosMax = 3;

            boolean exito = false;
            int entradaInt;
            int difernecia;
            String pista = "";

            if (exito != true) {
                for (int i = 0; i < intentosMax; i++) {
                    Scanner entrada = new Scanner(System.in);
                    entradaInt = entrada.nextInt();
                    if (numSecreto != entradaInt) {
                        if (entradaInt > numSecreto){
                            pista = "Mayor - " + pistaEspecifica(entradaInt, numSecreto);
                        } else
                            pista = "Menor - " + pistaEspecifica(entradaInt, numSecreto);
                        intentos += 1;
                    } else {
                        //gulih mabruk
                        break;
                    }
                }
                if (intentos <= intentosMax - 1) {

                }
            }


// mayor            - entrrada > num
// menor            - entrrada < num
//
// muy caliente     - d < 3
// caliente         - d < 5
// casi casi        - d < 10
// muy frio         - d < 20
// muy muy frio     - d < 25


        }
    }
//    private String pistaEspecifica(int x, int y){
//        int diferencia = x - y;
//        if (diferencia < 3) {
//            return "muy caliente";
//        } else if (diferencia < 5) {
//            return "caliente";
//        } else if (diferencia < 10) {
//            return "casi casi";
//        } else if (diferencia < 20) {
//            return "muy frio";
//        } else
//            return "muy muy frio";
//    }
//
