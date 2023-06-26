package paquete02.paquete14;


import paquete02.paquete09.Menu;

public class MenuEconomico extends Menu {
    public int porcentajeDescuento;
    public MenuEconomico() {}

    public MenuEconomico(String nombrePlato, double valorInicialMenu, int porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=super.valorInicialMenu-(super.valorInicialMenu*(this.porcentajeDescuento/100));
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Economico{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
