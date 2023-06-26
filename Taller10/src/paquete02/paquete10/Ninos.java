package paquete02.paquete10;


import paquete02.paquete09.Menu;

public class Ninos extends Menu {
    public double Helado;
    public double Pastel;

    public Ninos() {}
    public Ninos(String Plato, double valorInicialMenu, double Helado, double Pastel) {
        super(Plato, valorInicialMenu);
        this.Helado = Helado;
        this.Pastel = Pastel;
    }
    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=this.Helado+this.Pastel;
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Ninios{" +
                "Helado=" + Helado +
                ", Pastel=" + Pastel +
                '}';
    }
}
