package unidad3.implementacion.ia;

import java.util.LinkedList;

public class RutaAutonoma {

    public static void main(String[] args) {

        LinkedList<String> rutaActual = new LinkedList<>();
        System.out.println("Planificación Ruta");
        rutaActual.add("Ciudad A (inicio)");
        rutaActual.add("Ciudad B (Recarga)");
        rutaActual.add("Ciudad C");
        rutaActual.add("Ciudad D");
        System.out.println("Ruta Planificada " + rutaActual);

        System.out.println("Ruta planificada "+ rutaActual);
        String nuevoPunto = "Ciudad B (Recarga)";
        int indiceInterseccion = 1;
        rutaActual.add(indiceInterseccion, nuevoPunto);
        System.out.println("Ruta planificada " + rutaActual);

        String puntoBloqueado = "Ciudad D";
        rutaActual.remove(puntoBloqueado);

        System.out.println("Ruta planficada " + rutaActual);


    }

}
