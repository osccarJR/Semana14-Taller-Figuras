public class Piramide extends Figura {

    private double base, altura;

    public Piramide() {
        super();
    }

    @Override
    public int getNumeroPuntos() {
        return 5;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("El perimetro no es aplicable a esta figura.");
        return 0;
    }

    @Override
    public double calcularArea() {
        base = calcularDistancia(0, 1);
        altura = calcularDistancia(0, 4);  // El pico de la piramide en estos casos siempre sera 4
        return base * base + 4 * (0.5 * base * altura);
    }

    @Override
    public double calcularVolumen() {
        base = calcularDistancia(0, 1);
        altura = calcularDistancia(0, 4);  // 4 es el pico de la piramide
        return (1.0/3.0) * base * base * altura;
    }
}
