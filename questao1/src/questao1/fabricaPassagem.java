package questao1;

public abstract class fabricaPassagem {

    protected abstract iPassagem criarPassagem(String passageiro, double tarifa);

    public final void emitir(String passageiro, double tarifa) {
        iPassagem passagem = criarPassagem(passageiro, tarifa);
        System.out.println(passagem.gerarResumo());
        System.out.println();
    }
}
