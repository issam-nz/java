public class Main {

    public static String tablaFormatoTexto(int[] tabla) {
        String tablaTexto = ""; // para mostrar la tabla de forma {1, 2, ...n}
        for (int i = 0; i < tabla.length; i++) {
            if (i == 0)
                tablaTexto += "{";
            else if (i == tabla.length - 1) {
                tablaTexto += tabla[i] + "}";
            } else
                tablaTexto += tabla[i] + ", ";
        }
        return tablaTexto;
    }
    public static void main(String[] args) {
        int tabla[] = new int[]{ 11,35,33,75,39,26,67,78,49,18 };

        //1 suma de dos valores
        System.out.println("1)");
        int suma = tabla[0] + tabla[1];
        System.out.println("Suma de lod dos primeros: " + suma);

        //2 promedio de los valores (int)
        System.out.println("2)");
        int total = 0;
        int promedio;
        for (int i = 0; i < tabla.length; i++) {
            total += tabla[i];
        }
        promedio = (int) (total / tabla.length);
        System.out.println("el promedio de los valores es: " + promedio);

        //3 maximo de los valores
        System.out.println("3)");
        int maximo = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > maximo)
                maximo = tabla[i];
        }
        System.out.println("el valor maximo es: " + maximo);

        //4 minimo de los valores
        System.out.println("4)");
        int minimo = tabla[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] < minimo)
                minimo = tabla[i];
        }
        System.out.println("el valor minimo es: " + minimo);

        //5 cantidad de valores mayor o igual a 18
        System.out.println("5)");
        int cantidadMas18 = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] >= 18)
                cantidadMas18++;
        }
        System.out.println("la cantidad de valores mayor o igual a 18 es: " + cantidadMas18);

        //6 cantidad de valores entre 18 y 64 (incluidos)
        System.out.println("6)");
        int cantidad1864 = 0;
        for (int i = 0; i < tabla.length; i++) {
            if ((tabla[i] >= 18) && (tabla[i] <= 64))
                cantidad1864++;
        }
        System.out.println("la cantidad de valores entre 18 y 64 es: " + cantidad1864);

        //7 media de valores entre 20 y 39
        System.out.println("7)");
        int suma7 = 0;
        int media7;

        for (int i = 0; i < tabla.length; i++) {
            if ((tabla[i] >= 20) && (tabla[i] <= 39)) {
                suma7 += tabla[i];
            }
        }
        media7 = suma7 / tabla.length;
        System.out.println("la media de los valores que estén comprendidas entre 20 y 39: " + media7);

        //8 cantidad de pares e impares
        System.out.println("8)");
        int pares = 0, impares = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0)
                pares++;
            else
                impares++;
        }
        System.out.println("La cantidad de valores pares es: " + pares);
        System.out.println("La cantidad de valores impares es: " + impares);

        //9 si hay algun valor igual a la primera posicion
        System.out.println("9)");
        int posicion = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[0] == tabla[i])
                posicion = i;
        }
        if (posicion == 0)
            System.out.println("no hay nungun valor igual a la primera poscición");
        else
            System.out.println("el valor de la primera posicion igual al valor de la posicion " + posicion);
        //--------------------------------------
        System.out.println("----------------------------------");
        System.out.println("Algo mas dificil");

        //d1 maximo y su posicion
        System.out.println("d1)");
        int maximod = 0;
        int posicionmax = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > maximod) {
                maximod = tabla[i];
                posicionmax = i;
            }
        }
        System.out.println("el valor maximo es: " + maximod + " y su posicion es " + posicionmax);

        //d2 minimo y su posicion
        System.out.println("d2)");
        int minimod = tabla[0];
        int posicionmin = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] < minimod) {
                minimod = tabla[i];
                posicionmin = i;
            }
        }
        System.out.println("el valor minimo es: " + minimod + " y su posicion es " + posicionmin);

        //d3 segundo valor maximo
        System.out.println("d3)");
        int maximoSegundo = 0;
        int posicionSegundo = 0;

        for (int i = 0; i < tabla.length; i++) {
            if ((tabla[i] > maximoSegundo) && (maximoSegundo < maximod)) {
                maximoSegundo = tabla[i];
                posicionSegundo = i;
            }
        }
        System.out.println("el segundo valor maximo es: " + maximoSegundo + " y su posicion es " + posicionSegundo);

        //d4 cambio de valor en cada posicion con un intero aleatorio entre 0-100
        System.out.println("d4)");
        int numaleatorio;
        for (int i = 0; i < tabla.length; i++) {
            numaleatorio = (int) (Math.random()*100); //nuevo valor para tabla[i]
            tabla[i] = numaleatorio;
        }
        System.out.println(tablaFormatoTexto(tabla)); // para mostrar la tabla de forma {1, 2, ...n}

        //d5 pasar a una otra tabla los valores mayor que 50
        System.out.println("d5)");
            //el primero saber la longtitud de la nueva tabla
        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > 50)
                contador++;
        }
        int[] nuevaTabla = new int[contador]; // creacion de nueva tabla
        int j = 0; //nuevo contador para la nueva tabla. para evitar el error(index out of range)
        for (int i = 0; i < tabla.length; i++) {
            //asignar a la nueva tabla los valores mayores de 50
            if (tabla[i] > 50) {
                nuevaTabla[j] = tabla[i];
                j++;
            }
        }
        System.out.println("tabla con los valores mayores que 50: " + tablaFormatoTexto(nuevaTabla));

        //d6 si hay valores repetidos o no
        System.out.println("d6)");
        String valoresRepetidos = "";
        for (int i = 0; i < tabla.length; i++) {
            //creacion de otro boucle para comparar cada elemento de la tabla con los otros elementos
            // i es el elemento u j es para los otros
            for (int j = 0; j < tabla.length; j++) {
                if (i != j) { //si i es j es la misma posicion -> no es una repeticion
                    if (tabla[i] == tabla[j]) {
                        valoresRepetidos += tabla[i] + ", ";
                    }
                }
            }
        }
        if (valoresRepetidos.isEmpty()) {
            System.out.println("No hay valores repetidos en la tabla");
        } else {
            if (valoresRepetidos.endsWith(", "))
                //valoresRepetidos -= ", ";
                //despues mostrar los valores repetidos
        }






    }
}
