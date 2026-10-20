package questao1;

import java.util.List;

public abstract class iPassagem {

    private final String passageiro;

    public iPassagem(String passageiro) {
        this.passageiro = passageiro;
    }

    public abstract String modal();

    public abstract double calcularTaxaEmbarque();

    public abstract List<String> documentosExigidos();

    public String gerarResumo() {
        return "Modal            : " + modal()
             + "\nPassageiro       : " + passageiro
             + "\nTaxa de embarque : " + String.format("%.2f", calcularTaxaEmbarque())
             + "\nDocumentos       : " + String.join(", ", documentosExigidos());
    }
}
