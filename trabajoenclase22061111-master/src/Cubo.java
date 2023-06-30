public class Cubo extends Figura {

    private double lado;

    public Cubo() {
        super();
    }

    @Override
    public int getNumeroPuntos() {
        return 8;
    }

    @Override
    public double calcularPerimetro() {
        lado = calcularDistancia(0, 1);
        return 12 * lado;
    }

    @Override
    public double calcularArea() {
        lado = calcularDistancia(0, 1);
        return 6 * lado * lado;
    }

    @Override
    public double calcularVolumen() {
        lado = calcularDistancia(0, 1);
        return lado * lado * lado;
    }
}
