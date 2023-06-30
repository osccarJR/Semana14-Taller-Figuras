import java.util.Scanner;

public class Punto {
    private double x;
    private double y;

    public Punto() {}

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void ingresarPunto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el valor de X: ");
        this.x = scanner.nextDouble();
        System.out.print("Escribe el valor de Y: ");
        this.y = scanner.nextDouble();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
