package co.com.sofka.arusapp.model.asesor;
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
public class Asesor  {
    private int id;
    private TipoCedula tipoCedula;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private int genero;
    private String usuario;
    private String contrasena;

}
