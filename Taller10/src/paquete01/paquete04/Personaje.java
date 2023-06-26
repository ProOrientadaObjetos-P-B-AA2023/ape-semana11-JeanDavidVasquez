package paquete01.paquete04;

public abstract class Personaje {
    public String nombre;
    public int vida;
    public int nivel;

    public Personaje() {
    }
    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }
    public abstract void atacar(Personaje objetivo);
    public abstract void defender(int danio);
    public abstract boolean estaVivo();
    public void recibirDanio(int danio) {
        if (estaVivo()) {
            defender(danio);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void subirNivel() {
        nivel++;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Vida: " + vida + ", Nivel: " + nivel;
    }

}
