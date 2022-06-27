public class ContaBancariaControlada extends ContaBancariaBasica{
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();

        if(super.getSaldo() < saldoMinimo || super.getSaldo() <= 0){

            double valor = super.getSaldo()-valorPenalidade;
            super.setSaldo(valor);
        }

    }
    //sobrescreva o método aplicarAtualizacaoMensal para além de reajustar o
    // saldo da conta subtraindo a tarifa mensal e adicionando o valor de juros
    // mensal também aplicar a penalidade caso o saldo esteja abaixo do saldo mínimo.

}
