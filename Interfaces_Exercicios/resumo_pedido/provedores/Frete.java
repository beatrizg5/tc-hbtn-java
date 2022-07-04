package provedores;

public class Frete {
    public double valor;
    public TipoProvedorFrete tipoProvedorFrete;

    public Frete(double valor, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public Frete() {

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }
}
