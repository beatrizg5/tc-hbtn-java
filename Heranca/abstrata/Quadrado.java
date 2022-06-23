public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public String setLado(double lado) {

        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;

        }
        return null;
    }

    public String toString() {
        return String.format("[Quadrado] " + lado+0);
    }
}