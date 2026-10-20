package questao2;

public class fabricaChile implements iFabricaMatricula {

    @Override
    public String pais() {
        return "Chile";
    }

    @Override
    public iDocumentoFiscal criarDocumentoFiscal(DadosMatricula dados) {
        return new BoletaElectronica(dados);
    }

    @Override
    public iProcessadorPagamento criarProcessadorPagamento(DadosMatricula dados) {
        return new PagamentoWebpay(dados);
    }

    @Override
    public iComprovanteMatricula criarComprovanteMatricula(DadosMatricula dados) {
        return new ComprovanteRut(dados);
    }
}
