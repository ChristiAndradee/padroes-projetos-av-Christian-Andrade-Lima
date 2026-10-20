package questao2;

public class NfseBrasil implements iDocumentoFiscal {

    private final DadosMatricula dados;

    public NfseBrasil(DadosMatricula dados) {
        this.dados = dados;
    }

    @Override
    public String descricao() {
        return "NFS-e | base R$ " + String.format("%,.2f", dados.valor)
             + " | ISS 5% = R$ " + String.format("%,.2f", dados.valor * 0.05);
    }
}
