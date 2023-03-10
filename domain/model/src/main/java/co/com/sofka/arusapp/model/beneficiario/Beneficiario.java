package co.com.sofka.arusapp.model.beneficiario;
import co.com.sofka.arusapp.model.persona.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class Beneficiario extends Persona {
    private int tipoBeneficiario;
    private boolean estudia;
    private boolean dependiente;

}
