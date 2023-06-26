package paquete02.paquete11;


import paquete02.paquete09.Menu;

public class Carta extends Menu {
    public double valorPorcion;
    public double Bebida;
    public double porcentajeAdicional;

    public Carta() {}

    public Carta(String Plato, double valorInicialMenu, double valorPorcion, double Bebida, double porcentajeAdicional) {
        super(Plato, valorInicialMenu);
        this.valorPorcion = valorPorcion;
        this.Bebida = Bebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=this.valorPorcion+this.Bebida+(super.valorInicialMenu*(this.porcentajeAdicional/100));
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Carta{" +
                "valorPorcion=" + valorPorcion +
                ", Bebida=" + Bebida +
                ", porcentajeAdicional=" + porcentajeAdicional +
                '}';
    }
}
