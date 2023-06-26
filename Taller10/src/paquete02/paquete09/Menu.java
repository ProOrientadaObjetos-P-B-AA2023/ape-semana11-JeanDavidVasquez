package paquete02.paquete09;

public abstract class Menu {
    public String Plato;
    public double valorMenu;
    public double valorInicialMenu;

    public Menu() {}

    public Menu(String Plato, double valorInicialMenu) {
        this.Plato = Plato;
        this.valorInicialMenu=valorInicialMenu;
    }
    public abstract void calcularValorInicialMenu();
    public abstract void calcularValorMenu();

    public abstract double getValorMenu();

    @Override
    public String toString() {
        return "Menu{" +
                "Plato='" + Plato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorInicialMenu=" + valorInicialMenu +
                '}';
    }
}
