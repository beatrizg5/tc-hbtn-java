public class NumerosPares {
    public static void main(String[] args) {
        for (int i = 0; i <= 49; i++) {
            //System.out.print(i*2 + ", " );
            System.out.printf("%d%c ",i*2, i==49 ? 0: 44);
        }
    }
}