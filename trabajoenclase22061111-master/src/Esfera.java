public class Esfera extends Figura {

    private double radio;

    public Esfera() {
        super();
    }

    @Override
    public int getNumeroPuntos() {
        return 2;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("El perimetro no es aplicable a esta figura.");
        return 0;
    }

    @Override
    public double calcularArea() {
        radio = calcularDistancia(0, 1);
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
        radio = calcularDistancia(0, 1);
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }
}
