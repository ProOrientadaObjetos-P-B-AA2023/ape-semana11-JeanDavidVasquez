package paquete01.paquete05;

import paquete01.paquete04.Personaje;

import java.util.Random;

public class Arquero extends Personaje {
    private int precision;

    public Arquero() {
    }
    public Arquero(String nombre, int vida, int nivel, int precision) {
        super(nombre, vida, nivel);
        this.precision = precision;
    }
    @Override
    public void atacar(Personaje objetivo) {
        if (estaVivo()) {
            int danio = precision * nivel;
            objetivo.recibirDanio(danio);
            System.out.println(nombre + " dispara una flecha a " + objetivo.getNombre() + " causando " + danio + " puntos de daño.");
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
        return "Arquero - " + super.toString() + ", Precisión: " + precision;
    }
}
