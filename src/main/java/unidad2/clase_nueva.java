package unidad2;

public class clase_nueva {

    private int costoMana;

    public clase_nueva(int mana) {
        this.costoMana = mana;
    }

    public void usar() {
        System.out.println("La habilidad se ha usado.");
        System.out.println("Costó " + this.costoMana + " puntos de maná.");
    }
}

