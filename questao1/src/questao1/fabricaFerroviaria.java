package questao1;

public class fabricaFerroviaria extends fabricaPassagem {

    @Override
    protected iPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
