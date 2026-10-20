package questao1;

import java.util.List;

public class PassagemFerroviaria extends iPassagem {

    private final double tarifa;

    public PassagemFerroviaria(String passageiro, double tarifa) {
        super(passageiro);
        this.tarifa = tarifa;
    }

    @Override
    public String modal() {
        return "Ferroviaria";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return tarifa * 0.05;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("Documento de identidade com foto", "Comprovante de reserva");
    }
}
