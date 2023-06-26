package paquete02.paquete08;




import paquete02.paquete09.Menu;
import paquete02.paquete10.Ninos;
import paquete02.paquete11.Carta;
import paquete02.paquete12.CuentaPagar;
import paquete02.paquete13.DiaEspecial;
import paquete02.paquete14.MenuEconomico;

import java.util.ArrayList;

public class Ejecutor02 {
    public static void main(String[] args) {
        ArrayList<Menu> menus= new ArrayList<>();
        menus.add(new Ninos("Plato NINO", 12,3,4));
        menus.add(new Ninos("Plato NINO1",7,5,2));
        menus.add(new MenuEconomico("Plato ECONOMICO3",2,9));
        menus.add(new DiaEspecial("Plato ESPECIAL4",4,7,3));
        menus.add(new Carta("Plato CARTA5",10,1,4,1));
        for (Menu m:menus) {
            m.calcularValorInicialMenu();
            m.calcularValorMenu();
        }
        CuentaPagar cuenta= new CuentaPagar("JEAN DAVID",12);
        for(Menu m: menus){
            cuenta.calcularValorSubtotal(m.getValorMenu());
        }
        cuenta.calcularValorCancelar();
        cuenta.setMenus(menus);
        System.out.println(cuenta);
    }
}
