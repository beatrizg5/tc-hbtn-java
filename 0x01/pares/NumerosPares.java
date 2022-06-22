public class NumerosPares {
    public static void main(String args[]) {
        int valor;
        for (int i = 0; i < 99; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d%s", i, i == 98 ? "" : ", ");
            }
        }
        System.out.println();
    }
}
