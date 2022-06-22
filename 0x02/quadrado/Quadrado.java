public class Quadrado {
    public static double area(double lado) {

        if (lado > 0) {
        } else {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return (lado*lado);
    }
}