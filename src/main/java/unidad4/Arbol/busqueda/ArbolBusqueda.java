package unidad4.Arbol.busqueda;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class ArbolBusqueda {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");
        tree.insert("H");
        tree.insert("I");

        System.out.println("Arbol Binario Generico construido.");
        tree.traverseLevelOrder();
    }

}


