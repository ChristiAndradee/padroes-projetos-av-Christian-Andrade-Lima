package questao2;


public class ComprovanteRut implements iComprovanteMatricula {

    private final DadosMatricula dados;

    public ComprovanteRut(DadosMatricula dados) {
        this.dados = dados;
    }

    @Override
    public String descricao() {
        return "Comprobante de matricula | alumno: " + dados.aluno
             + " | RUT: " + dados.documento
             + " | curso: " + dados.curso;
    }
}
