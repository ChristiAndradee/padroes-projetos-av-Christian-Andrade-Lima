package questao1;

import java.util.List;

public class PassagemRodoviaria extends iPassagem {

    private final double tarifa;

    public PassagemRodoviaria(String passageiro, double tarifa) {
        super(passageiro);
        this.tarifa = tarifa;
    }

    @Override
    public String modal() {
        return "Rodoviaria";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return tarifa * 0.03;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("Documento de identidade com foto");
    }
}
