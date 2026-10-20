package questao2;

public interface iFabricaMatricula {

    String pais();

    iDocumentoFiscal criarDocumentoFiscal(DadosMatricula dados);

    iProcessadorPagamento criarProcessadorPagamento(DadosMatricula dados);

    iComprovanteMatricula criarComprovanteMatricula(DadosMatricula dados);
}
