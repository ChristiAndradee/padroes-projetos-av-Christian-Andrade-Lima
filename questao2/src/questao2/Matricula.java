package questao2;

public class Matricula {

    private final iFabricaMatricula fabrica;

    public Matricula(iFabricaMatricula fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(DadosMatricula dados) {

        iDocumentoFiscal documento = fabrica.criarDocumentoFiscal(dados);
        iProcessadorPagamento pagamento = fabrica.criarProcessadorPagamento(dados);
        iComprovanteMatricula comprovante = fabrica.criarComprovanteMatricula(dados);

        System.out.println("=============================================================");
        System.out.println("Matricula de " + dados.aluno + "  |  pais: " + fabrica.pais());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Documento fiscal : " + documento.descricao());
        System.out.println("Pagamento        : " + pagamento.descricao());
        System.out.println("Comprovante      : " + comprovante.descricao());
        System.out.println("=============================================================");
        System.out.println();
    }
}
