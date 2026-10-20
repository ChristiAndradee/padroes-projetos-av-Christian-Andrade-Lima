package questao2;

public class PagamentoWebpay implements iProcessadorPagamento {

    private final DadosMatricula dados;

    public PagamentoWebpay(DadosMatricula dados) {
        this.dados = dados;
    }

    @Override
    public String descricao() {
        return "Webpay | total CLP$ " + String.format("%,.2f", dados.valor)
             + " | transaccion autorizada";
    }
}
