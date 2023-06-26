package paquete01.paquete07;

import paquete01.paquete04.Personaje;

public class Mago extends Personaje {
    private int poderMagico;

    public Mago() {
    }
    public Mago(String nombre, int vida, int nivel, int poderMagico) {
        super(nombre, vida, nivel);
        this.poderMagico = poderMagico;
    }
    @Override
    public void atacar(Personaje objetivo) {
        if (estaVivo()) {
            int danio = poderMagico * nivel;
            objetivo.recibirDanio(danio);
            System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + danio + " puntos de daño.");
        }
    }
    @Override
    public void defender(int danio) {
        vida -= danio;
        if (!estaVivo()) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }
    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
    @Override
    public String toString() {
        return "Mago - " + super.toString() + ", Poder Mágico: " + poderMagico;
    }
}

