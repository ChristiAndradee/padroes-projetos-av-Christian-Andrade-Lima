package questao2;

public class ComprovanteCpf implements iComprovanteMatricula {

    private final DadosMatricula dados;

    public ComprovanteCpf(DadosMatricula dados) {
        this.dados = dados;
    }

    @Override
    public String descricao() {
        return "Comprovante de matricula | aluno: " + dados.aluno
             + " | CPF: " + dados.documento
             + " | curso: " + dados.curso;
    }
}
