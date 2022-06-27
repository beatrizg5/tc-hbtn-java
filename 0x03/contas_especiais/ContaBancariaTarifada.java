import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;
    double saldo=getSaldo();

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        } else {
            double saldo = valor;
        }

    }
    @Override
    void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {

            if (valor <= saldo) {
                saldo -= valor;
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }

}
