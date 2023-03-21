package co.com.sofka.arusapp.jpa.beneficiario;

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
@Table(name="Beneficiarios")
public class BeneficiarioDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_beneficiario")
    private int idBeneficiario;
    @OneToOne(mappedBy = "tipoCedula", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private TipoCedula tipoCedula;
    private String cedula;
    private String nombres;
    private String apellidos;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @OneToOne(mappedBy = "genero", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private int genero;

    @OneToOne(mappedBy = "tipoBeneficiario", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private int tipoBeneficiario;
    private boolean estudia;
    private boolean dependiente;
}
