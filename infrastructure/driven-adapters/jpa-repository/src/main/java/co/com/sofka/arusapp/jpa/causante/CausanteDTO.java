package co.com.sofka.arusapp.jpa.causante;

import co.com.sofka.arusapp.model.asesor.Asesor;
import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import co.com.sofka.arusapp.model.genero.Genero;
import co.com.sofka.arusapp.model.tipocedula.TipoCedula;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name="Causantes")
public class CausanteDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_causante")
    private int id;
    @Column(name="cedula")
    private String cedula;
    private String nombres;
    private String apellidos;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @OneToOne(mappedBy = "asesor", cascade = CascadeType.ALL)
    private Asesor asesor;
    @OneToOne(mappedBy = "beneficiario", cascade = CascadeType.ALL)
    private Beneficiario beneficiario;

    @OneToOne(mappedBy = "tipoCedula", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private TipoCedula tipoCedula;

    @OneToOne(mappedBy = "genero", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Genero genero;


}
