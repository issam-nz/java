import java.text.DecimalFormat;
public class Electodomestico {
    private double precioSinIVA;
    private char consumoEnergetico;
    private double peso;
    private String color;

    // Constructor sin parametros
    public Electodomestico() {
        precioSinIVA = 400;
        consumoEnergetico = 'A';
        peso = 30;
        color = "blanco";
    }

    // Constructor con 2 params : precio y peso
    public Electodomestico(double pr, double pe) {
        precioSinIVA = pr;
        consumoEnergetico = 'A';
        peso = pe;
        color = "blanco";
    }

    // Constructor con 4 params
    public Electodomestico(double pr,char con, double pe, String col) {
        precioSinIVA = pr;
        consumoEnergetico = con;
        peso = pe;
        color = col;
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public String obtenerPrecio() {
        return df.format(precioSinIVA);
    }

    public char obtenerConsumo() {
        return consumoEnergetico;
    }

    public String obtenerPeso() {
        return df.format(peso);
    }

    public String obtenerColor() {
        return color;
    }

    public boolean esEficiente() {
        if ((consumoEnergetico == 'A') && (consumoEnergetico == 'B'))
            return true;
        else
            return false;
    }

    public double obtenerPrecioFinal() {
        double pf = precioSinIVA + precioSinIVA * 0.21;;
        return Math.round(pf*100.00)/100.00;
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }



    /*
    //version 1 de hacer oferta
    // devuelve el precio con la oferta pero no cambia el precio original
    public double hacerOferta(double porcentaje) {
        return obtenerPrecioFinal() - (obtenerPrecioFinal() * porcentaje / 100);
    }*/

    
}
//----------------------
public class main {
    public static void main(String[] args) {
        Electodomestico frigo1 = new Electodomestico(660, 'A', 50, "blanco");
        Electodomestico lavadora1 = new Electodomestico(400, 'A', 30, "blanco");

        //acciones con frigo1
        System.out.println("Frigo 1");
        System.out.println("Precio sin Iva: " + frigo1.obtenerPrecio());
        System.out.println("Precio con Iva: " + frigo1.obtenerPrecioFinal());
        String esEf = frigo1.esEficiente() ? "Es Eficiente" : " No es Eficiente";
        frigo1.cambiarColor("negro");
//        frigo1.hacerOferta(12);

        System.out.println("Precio sin Iva: " + frigo1.obtenerPrecio());
        System.out.println("Precio con Iva: " + frigo1.obtenerPrecioFinal());

        //acciones con lavadora1
        System.out.println("Lavadora 1");
        System.out.println("Precio sin IVA: " + lavadora1.obtenerPrecio());
        System.out.println("Consumo: " + lavadora1.obtenerConsumo());
        System.out.println("Peso: " + lavadora1.obtenerPeso());
        System.out.println("Color: " + lavadora1.obtenerColor());
        System.out.println("Precio con Iva: " + lavadora1.obtenerPrecioFinal());


    }

}
//hacerOferta : tengo q saber si si devuelve el precio conla oferta y hasta o se cambia el precio final
//yo pienso que tengo que añadir un atributo q se llama el precio final
//o la oferta se hace con el precio sin IVA ?
