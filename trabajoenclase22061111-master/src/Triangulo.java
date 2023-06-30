public class Triangulo extends Figura {

    public Triangulo() {
        super();
    }

    @Override
    public double calcularPerimetro() {
        double l1 = calcularDistancia(0, 1);
        double l2 = calcularDistancia(1, 2);
        double l3 = calcularDistancia(2, 0);
        return l1 + l2 + l3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        double a = calcularDistancia(0, 1);
        double b = calcularDistancia(1, 2);
        double c = calcularDistancia(2, 0);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calcularVolumen() {
        System.out.println("El volumen no es aplicable para un Triangulo.");
        return 0;
    }

    @Override
    public int getNumeroPuntos() {
        return 3;
    }
}
