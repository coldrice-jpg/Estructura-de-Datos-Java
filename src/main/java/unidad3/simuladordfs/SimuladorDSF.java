package unidad3.simuladordfs;

public class SimuladorDSF {

    public static void main(String[] args){

        PilaListaEnlazada pila = new PilaListaEnlazada();

        pila.push("A");
        System.out.println("Inicio en A");
        pila.mostrar();

        String actual = pila.pop();
        System.out.println("POP & Visitar");
        pila.mostrar();

        pila.push("B");
        System.out.println("B vecino de A");
        pila.mostrar();

        pila.push("C");
        System.out.println("C vecino de B");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP & Visitar");
        pila.mostrar();

        pila.push("D");
        System.out.println("D vecino de C");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP & Visitar");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP & Visitar");
        pila.mostrar();

        pila.push("E");
        System.out.println("E vecino de D");
        pila.mostrar();

    }

}
