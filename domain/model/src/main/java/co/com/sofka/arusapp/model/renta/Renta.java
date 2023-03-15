package co.com.sofka.arusapp.model.renta;
import co.com.sofka.arusapp.model.causante.Causante;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Currency;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class Renta {
    private int id;
    private Causante causante;
    private Date fechaSolicitud;
    private Currency salarioActual;
    private int meses;


}
