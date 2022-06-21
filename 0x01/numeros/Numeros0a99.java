public class Numeros0a99 {
    static final int MAX_NUM = 99;

    public static void main(String[] args) {
        for(int i=0; i<=MAX_NUM; i++){
            System.out.printf("%d%c ",i, i==MAX_NUM ? 00: 44);
        }
    }
}

