package co.com.sofka.arusapp.model.beneficiario;
import co.com.sofka.arusapp.model.tipocedula.TipoCedula;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class Beneficiario {
    private Integer idBeneficiario;
    private TipoCedula tipoCedula;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private int genero;
    private int tipoBeneficiario;
    private boolean estudia;
    private boolean dependiente;

}
