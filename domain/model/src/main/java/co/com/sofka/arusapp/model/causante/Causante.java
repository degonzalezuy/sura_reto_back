package co.com.sofka.arusapp.model.causante;
import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class Causante {
    private int id;
    private int tipoCedula;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private int genero;
    private Beneficiario beneficiario;

}
