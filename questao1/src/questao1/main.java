package questao1;

public class main {

    public static void main(String[] args) {

        fabricaPassagem emissorAereo = new fabricaAerea();
        emissorAereo.emitir("Ryann Valim", 1200.00);

        fabricaPassagem emissorRodoviario = new fabricaRodoviaria();
        emissorRodoviario.emitir("Lucas Haboski", 180.00);

        fabricaPassagem emissorFerroviario = new fabricaFerroviaria();
        emissorFerroviario.emitir("Kelvi Moacir", 350.00);
    }
}
