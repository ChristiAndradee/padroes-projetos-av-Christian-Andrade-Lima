package questao2;

public class main {

    public static void main(String[] args) {

        DadosMatricula brasil = new DadosMatricula();
        brasil.aluno = "Ryann Valim";
        brasil.documento = "123.456.789-00";
        brasil.curso = "Padroes de Projeto";
        brasil.valor = 1200.00;

        new Matricula(new fabricaBrasil()).confirmar(brasil);

        DadosMatricula chile = new DadosMatricula();
        chile.aluno = "Lucas Haboski";
        chile.documento = "12.345.678-9";
        chile.curso = "Estrutura de Dados Avançada";
        chile.valor = 980.00;

        new Matricula(new fabricaChile()).confirmar(chile);
    }
}
