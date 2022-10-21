import java.util.Scanner;

public class NumSecreto {

    private int numAler;
    private int intentos = 0;
    private final int intentosMax = 3;


    public NumSecreto() {
        numAler = (int) (Math.random()*100) +1;
    }
    public void mostrarNum() {
        System.out.println(numAler);
    }

    public boolean esExito(int x) {
        return numAler == x;
    }

    private String pistaEspecifica(int x, int y){
        int diferencia = x - y;
        String pistaEs;
        if (diferencia <= 3) {
            pistaEs = "muy caliente";
        } if (diferencia <= 5) {
            pistaEs = "caliente";
        } if (diferencia <= 10) {
            pistaEs = "casi casi";
        } if (diferencia <= 20) {
            pistaEs = "muy frio";
        } else
            pistaEs = "muy muy frio";
        return pistaEs;
    }

    public String pista(int x) {
        String p = "";
        if (x > numAler){
            p = "Mayor - " + pistaEspecifica(x, numAler);
        } else
            p = "Menor - " + pistaEspecifica(x, numAler);
        intentos += 1;
        return p;
    }


    public void boucle() {
        while (intentos < intentosMax) {
            Scanner entrada = new Scanner(System.in);
            int x = entrada.nextInt();
            if (esExito(x)) {
                System.out.println("congrats");
                System.out.println("intentos: " + intentos);
                break;
            }
            // EsExito not true
            else {
                //darle la pista
                System.out.println(pista(x));
                System.out.println("intentos: " + intentos);
            }
            if (intentos == intentosMax ) {
                System.out.println("GAME OVER");
            }
        }

    }

}

//---------------------------

public class Main {
    public static void main(String[] args) {
        NumSecreto number = new NumSecreto();
        number.mostrarNum();
        number.boucle();

    }
}












