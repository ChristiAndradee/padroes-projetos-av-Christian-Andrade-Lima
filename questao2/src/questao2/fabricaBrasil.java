package questao2;

public class fabricaBrasil implements iFabricaMatricula {

    @Override
    public String pais() {
        return "Brasil";
    }

    @Override
    public iDocumentoFiscal criarDocumentoFiscal(DadosMatricula dados) {
        return new NfseBrasil(dados);
    }

    @Override
    public iProcessadorPagamento criarProcessadorPagamento(DadosMatricula dados) {
        return new PagamentoPix(dados);
    }

    @Override
    public iComprovanteMatricula criarComprovanteMatricula(DadosMatricula dados) {
        return new ComprovanteCpf(dados);
    }
}
