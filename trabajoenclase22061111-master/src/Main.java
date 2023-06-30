import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Figura> figuras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Escribe una nueva figura");
            System.out.println("2. Ver todas las figuras");
            System.out.println("3. Elegir una figura");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                ingresarFigura();
            } else if (opcion == 2) {
                verFiguras();
            } else if (opcion == 3) {
                operarFigura();
            } else if (opcion == 4) {
                break;
            }
        }
    }

    private static void ingresarFigura() {
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Piramide");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        Figura figura = null;
        if (opcion == 1) {
            figura = new Circulo();
        } else if (opcion == 2) {
            figura = new Cuadrado();
        } else if (opcion == 3) {
            figura = new Triangulo();
        } else if (opcion == 4) {
            figura = new Esfera();
        } else if (opcion == 5) {
            figura = new Cubo();
        } else if (opcion == 6) {
            figura = new Piramide();
        }
        figura.ingresarPuntos();
        figuras.add(figura);
    }

    private static void verFiguras() {
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println((i + 1) + ". " + figuras.get(i).getClass().getSimpleName());
        }
    }

    private static void operarFigura() {
        System.out.println("Elige el numero de la figura que quieres operar:");
        verFiguras();
        int opcion = scanner.nextInt();
        scanner.nextLine();
        Figura figura = figuras.get(opcion - 1);

        while (true) {
            System.out.println("1. Calcular area");
            System.out.println("2. Calcular perimetro");
            System.out.println("3. Calcular volumen");
            System.out.println("4. Regresar al menu principal");
            int seleccion = scanner.nextInt();
            scanner.nextLine();
            if (seleccion == 1) {
                System.out.println("Area: " + figura.calcularArea());
            } else if (seleccion == 2) {
                System.out.println("Perimetro: " + figura.calcularPerimetro());
            } else if (seleccion == 3) {
                System.out.println("Volumen: " + figura.calcularVolumen());
            } else if (seleccion == 4) {
                break;
            }
        }
    }
}
