package unidad3.colas.practica02;

import java.util.LinkedList;
import java.util.Queue;

public class ServidorWeb {

    public static void main(String[] args){

        // Crear una instancia de Queue
        Queue<String> colaUsuarios  = new LinkedList<>();

        colaUsuarios.add("Alice");
        colaUsuarios.add("Bob");
        colaUsuarios.add("Charlie");
        colaUsuarios.add("David");
        colaUsuarios.add("Eve");

        System.out.println("Cola despues de agregar usuarios " + colaUsuarios);

        while(!colaUsuarios.isEmpty()) {
            String usuario = colaUsuarios.poll();
            System.out.println("Atendiendo: " + usuario);
        }

        System.out.println("Cola despues de atender a los usuarios: " +
                " " + colaUsuarios);

    }

}
