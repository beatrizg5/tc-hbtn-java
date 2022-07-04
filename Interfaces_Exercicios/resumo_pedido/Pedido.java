import provedores.Frete;
import provedores.TipoProvedorFrete;

public class Pedido extends Frete {
    public int codigo;
    public double peso;
    public double total;
    public Frete frete;

    public Pedido(double valor, TipoProvedorFrete tipoProvedorFrete) {
        super(valor, tipoProvedorFrete);
    }

    public Pedido(double valor, int codigo, double peso) {

        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
        this.frete = frete;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
