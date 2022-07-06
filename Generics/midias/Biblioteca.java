import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia> {

    private List<T> biblioteca;

    public Biblioteca(){
        this.biblioteca = new ArrayList<T>();
    }

    public void adicionarMidia(T valorMidia){
        this.biblioteca.add(valorMidia);
    }
    public List<T> obterListaMidias(){
        return biblioteca;
    }
}
