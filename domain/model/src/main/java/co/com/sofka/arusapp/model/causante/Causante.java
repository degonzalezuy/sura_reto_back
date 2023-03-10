package co.com.sofka.arusapp.model.causante;
import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import co.com.sofka.arusapp.model.persona.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class Causante extends Persona {
    private Beneficiario beneficiario;

}
