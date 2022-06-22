public class Numero {
    public static void dividir(int a, int b) {
        try {
            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (ArithmeticException e1) {
            System.out.println("Nao eh possivel dividir por zero"+ "\n"+ a + " / " + b + " = " + "0" );
        } finally {
        }
    }
}

