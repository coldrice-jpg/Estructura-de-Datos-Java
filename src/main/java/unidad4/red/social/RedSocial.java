package unidad4.red.social;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedSocial {

    private final Map<Usuario, List<Usuario>> adjencias = new HashMap<>();

    public void conectarAmigos(Usuario seguidor, Usuario seguido) throws IllegalAccessException {
        if (!adjencias.containsKey(seguidor) || !adjencias.containsKey(seguido)){
            throw new IllegalAccessException("Los usuarios no existen en la red");
        }

        adjencias.get(seguidor).add(seguido);
        adjencias.get(seguido).add(seguidor);

    }

    public void imprimirRed(){
        adjencias.forEach((usuario, amigos) -> System.out.println(usuario.getNombre +
                "es amigo de " + amigos));
    }

    public void agregarUsuarios(Usuario usuario){
        adjencias.putIfAbsent(usuario, new java.util.ArrayList<>());
    }

    public static void main(String[] args) throws IllegalAccessException {
        RedSocial red = new RedSocial();

        // Crear nodos
        Usuario naomi = new Usuario("naomi", 1);
        Usuario pedro = new Usuario("pedro", 2);
        Usuario jose = new Usuario("jose", 3);
        Usuario alan = new Usuario("alan", 4);
        Usuario eduardo = new Usuario("eduardo", 5);

        red.agregarUsuarios(naomi);
        red.agregarUsuarios(pedro);
        red.agregarUsuarios(jose);
        red.agregarUsuarios(alan);
        red.agregarUsuarios(eduardo);

        // Crear conexiones entre amigos
        red.conectarAmigos(naomi, alan);
        red.conectarAmigos(jose, naomi);
        red.conectarAmigos(eduardo, alan);
        red.conectarAmigos(alan, jose);
        red.conectarAmigos(alan, pedro);
        red.conectarAmigos(pedro, naomi);
        red.conectarAmigos(pedro, eduardo);

        // Imprimir conexiones
        red.imprimirRed();

    }

}
