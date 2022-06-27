public class ContaBancariaControlada extends ContaBancariaBasica{
    private double saldoMinimo;
    private double valorPenalidade;
    double saldo = getSaldo();

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }
    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    void aplicarAtualizacaoMensal() {

        double juros = calcularJurosMensal() * saldo;
        saldo -= calcularTarifaMensal();
        saldo += juros;
        if(saldo<saldoMinimo){
            saldo+=valorPenalidade;
        }

    }

}
