import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;



    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    void depositar(double valor) {
        double taxa = 0.10;
        double saldo = getSaldo();
        saldo = saldo + valor - taxa;
        super.setSaldo(saldo);
        this.quantidadeTransacoes++;


    }

    @Override
    void sacar(double valor) {
        double taxa = 0.10;
        double saldo = getSaldo();
        saldo = saldo -valor - taxa;
        super.setSaldo(saldo);
        this.quantidadeTransacoes++;
    }
}

