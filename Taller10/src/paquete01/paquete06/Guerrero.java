package paquete01.paquete06;

import paquete01.paquete04.Personaje;

public class Guerrero extends Personaje {
    private int fuerza;
    public Guerrero(String nombre, int vida, int nivel, int fuerza) {
        super(nombre, vida, nivel);
        this.fuerza = fuerza;
    }
    @Override
    public void atacar(Personaje objetivo) {
        if (estaVivo()) {
            int danio = fuerza * nivel;
            objetivo.recibirDanio(danio);
            System.out.println(nombre + " ataca a " + objetivo.getNombre() + " causando " + danio + " puntos de daño.");
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
        return "Guerrero - " + super.toString() + ", Fuerza: " + fuerza;
    }
}
