
package paquete01.paquete03;

import paquete01.paquete04.Personaje;
import paquete01.paquete05.Arquero;
import paquete01.paquete06.Guerrero;
import paquete01.paquete07.Mago;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutor02 {
    private static List<Personaje> personajes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println(" Juego de Rol ");
            System.out.println("1. Crear personaje");
            System.out.println("2. Mostrar estadísticas de personajes");
            System.out.println("3. Empezar batalla");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    mostrarEstadisticasPersonajes();
                    break;
                case 3:
                    empezarBatalla();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 4.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Gracias por jugar");
    }

    public static void crearPersonaje() {
        System.out.println("Crear Personaje: ");
        System.out.print("Ingrese el nombre del personaje: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la vida del personaje: ");
        int vida = scanner.nextInt();
        System.out.print("Ingrese el nivel del personaje: ");
        int nivel = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Seleccione el tipo de personaje:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.print("Ingrese una opción: ");
        int tipoPersonaje = scanner.nextInt();
        scanner.nextLine();

        Personaje personaje;

        switch (tipoPersonaje) {
            case 1:
                System.out.print("Ingrese la fuerza del guerrero: ");
                int fuerza = scanner.nextInt();
                personaje = new Guerrero(nombre, vida, nivel, fuerza);
                break;
            case 2:
                System.out.print("Ingrese el poder mágico del mago: ");
                int poderMagico = scanner.nextInt();
                personaje = new Mago(nombre, vida, nivel, poderMagico);
                break;
            case 3:
                System.out.print("Ingrese la precisión del arquero: ");
                int precision = scanner.nextInt();
                personaje = new Arquero(nombre, vida, nivel, precision);
                break;
            default:
                System.out.println("Opción inválida. El personaje se creará como Guerrero por defecto.");
                personaje = new Guerrero(nombre, vida, nivel, 10);
                break;
        }

        personajes.add(personaje);
        System.out.println("El personaje se ha creado exitosamente.");
    }

    private static void mostrarEstadisticasPersonajes() {
        System.out.println(" Estadísticas de Personajes ");
        if (personajes.isEmpty()) { //isEmpty es para el array, para verificar si en el array esta vacio o existe algun personaje,no olvidar dato importante
            System.out.println("No hay personajes creados.");
        } else {
            for (Personaje personaje : personajes) {
                System.out.println(personaje);
            }
        }
    }

    private static void empezarBatalla() {
        System.out.println("Empezar Batalla");
        if (personajes.size() < 2) {
            System.out.println("Debe haber al menos 2 personajes para iniciar una batalla.");
        } else {
            System.out.println("Seleccione los dos personajes para la batalla:");

            for (int i = 0; i < personajes.size(); i++) {
                System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
            }

            System.out.print("Ingrese el número del primer personaje: ");
            int indicePersonaje1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el número del segundo personaje: ");
            int indicePersonaje2 = scanner.nextInt();
            scanner.nextLine();

            if (indicePersonaje1 >= 1 && indicePersonaje1 <= personajes.size() && //size para ver el tamaño del array, dato importante no olvidar
                    indicePersonaje2 >= 1 && indicePersonaje2 <= personajes.size()) {
                Personaje personaje1 = personajes.get(indicePersonaje1 - 1);
                Personaje personaje2 = personajes.get(indicePersonaje2 - 1);

                System.out.println("¡La batalla ha comenzado!");
                System.out.println(personaje1.getNombre() + " VS " + personaje2.getNombre());
                System.out.println();

                while (personaje1.estaVivo() && personaje2.estaVivo()) {
                    personaje1.atacar(personaje2);
                    personaje2.atacar(personaje1);
                    System.out.println();
                }

                System.out.println("Resultado de la batalla:");
                System.out.println(personaje1);
                System.out.println(personaje2);

                Personaje ganador = (personaje1.estaVivo()) ? personaje1 : personaje2;
                System.out.println("¡" + ganador.getNombre() + " ha ganado la batalla!");
            } else {
                System.out.println("Opción inválida. Por favor, ingrese números válidos correspondientes a los personajes.");
            }
        }
    }
}
