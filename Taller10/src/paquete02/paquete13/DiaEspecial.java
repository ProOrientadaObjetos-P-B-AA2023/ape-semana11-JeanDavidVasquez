package paquete02.paquete13;


import paquete02.paquete09.Menu;

public class DiaEspecial extends Menu {
    public double Postre;
    public double Bebida;

    public DiaEspecial() {}

    public DiaEspecial(String nombrePlato, double valorInicialMenu, double valorPostre, double Bebida) {
        super(nombrePlato, valorInicialMenu);
        this.Postre = Postre;
        this.Bebida = Bebida;
    }
    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=this.Postre+this.Bebida;
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Dia{" +
                "Postre=" + Postre +
                ", Bebida=" + Bebida +
                '}';
    }
}

