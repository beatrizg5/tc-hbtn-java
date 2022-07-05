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


    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

}
