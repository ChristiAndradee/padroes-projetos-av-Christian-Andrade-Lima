package questao1;

public class fabricaAerea extends fabricaPassagem {

    @Override
    protected iPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
