package co.com.sofka.arusapp.model.tipobeneficiario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class TipoBeneficiario {
    private int id;
    private String descripcion;
}
