package co.com.sofka.arusapp.model.causante;
import co.com.sofka.arusapp.model.asesor.Asesor;
import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import co.com.sofka.arusapp.model.genero.Genero;
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
public class Causante{
    private Integer id;
    private TipoCedula tipoCedula;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private Genero genero;
    private Asesor asesor;
    private Beneficiario beneficiario;

}
