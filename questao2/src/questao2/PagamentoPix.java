package questao2;

public class PagamentoPix implements iProcessadorPagamento {

    private final DadosMatricula dados;

    public PagamentoPix(DadosMatricula dados) {
        this.dados = dados;
    }

    @Override
    public String descricao() {
        return "Pix | total R$ " + String.format("%,.2f", dados.valor)
             + " | aprovado em tempo real";
    }
}
