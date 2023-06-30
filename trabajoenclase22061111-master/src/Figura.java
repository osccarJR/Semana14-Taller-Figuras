import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura implements ICalculable {
    private List<Punto> puntos;

    public Figura() {
        puntos = new ArrayList<>();
    }

    public abstract int getNumeroPuntos();

    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < getNumeroPuntos(); i++) {
            System.out.println("Escribe el punto " + (i + 1) + ": ");
            System.out.print("x: ");
            double x = sc.nextDouble();
            System.out.print("y: ");
            double y = sc.nextDouble();
            puntos.add(new Punto(x, y));
        }
    }

    public double calcularDistancia(int i, int j) {
        Punto p1 = puntos.get(i);
        Punto p2 = puntos.get(j);
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

    public void mostrarPuntos() {
        for (int i = 0; i < getNumeroPuntos(); i++) {
            System.out.println("Punto " + (i + 1) + ": " + puntos.get(i));
        }
    }
}
