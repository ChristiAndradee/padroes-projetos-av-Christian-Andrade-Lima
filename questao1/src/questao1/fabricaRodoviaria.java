package questao1;

public class fabricaRodoviaria extends fabricaPassagem {

    @Override
    protected iPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
