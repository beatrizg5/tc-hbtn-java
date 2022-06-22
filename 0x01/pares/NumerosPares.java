public class NumerosPares {
    public static void main(String args[]) {
        int valor;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                if(i>0){
                System.out.printf(", ");
                    }
                System.out.print(i);
            }
        }
    }
}
