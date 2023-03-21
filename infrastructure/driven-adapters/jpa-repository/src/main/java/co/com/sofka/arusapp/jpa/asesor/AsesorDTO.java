package co.com.sofka.arusapp.jpa.asesor;

import co.com.sofka.arusapp.model.tipocedula.TipoCedula;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
@Table(name="Asesores")
public class AsesorDTO {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idAsesor")
        private Integer idAsesor;
        private TipoCedula tipoCedula;
        private String cedula;
        private String nombres;
        private String apellidos;
        private Date fechaNacimiento;
        private int genero;
        private String usuario;
        private String contrasena;


}
