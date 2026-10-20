package questao2;

public class BoletaElectronica implements iDocumentoFiscal {

    private final DadosMatricula dados;

    public BoletaElectronica(DadosMatricula dados) {
        this.dados = dados;
    }

    @Override
    public String descricao() {
        return "Boleta electronica | base CLP$ " + String.format("%,.2f", dados.valor)
             + " | IVA 19% = CLP$ " + String.format("%,.2f", dados.valor * 0.19);
    }
}
