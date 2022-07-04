package provedores;

public interface ProvedorFrete {
    public default Frete calcularFrete(double peso, double valor) {
        return null;

    }

    public default TipoProvedorFrete obterTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        return tipoProvedorFrete;

    }
}
