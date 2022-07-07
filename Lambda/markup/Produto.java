import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private final String nome;
    private double preco;
    private double percentualMarkup = 0.10;

    public Supplier<Double> precoComMarkup = () -> preco + (preco * percentualMarkup);
    public Consumer<Double> atualizarMarkup = this::setPercentualMarkup;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }
}