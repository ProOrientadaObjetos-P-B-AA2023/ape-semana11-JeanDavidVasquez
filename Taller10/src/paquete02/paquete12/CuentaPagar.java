package paquete02.paquete12;



import paquete02.paquete09.Menu;

import java.util.ArrayList;

public class CuentaPagar {
    public String Cliente;
    public ArrayList<Menu> menus;
    public double Cancelar;
    public double SubTotal;
    public double iva;

    public CuentaPagar() {}

    public CuentaPagar(String Cliente, double iva) {
        this.Cliente = Cliente;
        this.iva=iva;
    }
    public void setMenus(ArrayList<Menu> menus){
        this.menus= menus;
    }
    public void calcularValorSubtotal(double SubTotal){
        this.SubTotal+=SubTotal;
    }
    public void calcularValorCancelar(){
        this.Cancelar=this.SubTotal+(this.SubTotal*(this.iva/100));
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Cliente='" + Cliente + '\'' +
                ", menus=" + menus +
                ", Cancelar=" + Cancelar +
                ", SubTotal=" + SubTotal +
                ", iva=" + iva +
                '}';
    }
}
