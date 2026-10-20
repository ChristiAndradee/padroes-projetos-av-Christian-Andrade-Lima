package questao1;

import java.util.List;

public class PassagemAerea extends iPassagem {

    private final double tarifa;

    public PassagemAerea(String passageiro, double tarifa) {
        super(passageiro);
        this.tarifa = tarifa;
    }

    @Override
    public String modal() {
        return "Aerea";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return tarifa * 0.08;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletronico (e-ticket)");
    }
}
