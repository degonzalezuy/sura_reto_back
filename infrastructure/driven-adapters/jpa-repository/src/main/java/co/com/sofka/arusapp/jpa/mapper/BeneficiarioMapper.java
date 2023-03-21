package co.com.sofka.arusapp.jpa.mapper;

import co.com.sofka.arusapp.jpa.beneficiario.BeneficiarioDTO;
import co.com.sofka.arusapp.jpa.causante.CausanteDTO;
import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import co.com.sofka.arusapp.model.causante.Causante;
import co.com.sofka.arusapp.model.tipocedula.TipoCedula;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BeneficiarioMapper {
    public static BeneficiarioDTO beneficiarioToBeneficiarioDTO(Beneficiario beneficiario){
        return BeneficiarioDTO.builder()
            .idBeneficiario(beneficiario.getIdBeneficiario())
            .tipoCedula(beneficiario.getTipoCedula())
            .cedula(beneficiario.getCedula())
            .nombres(beneficiario.getNombres())
            .apellidos(beneficiario.getApellidos())
            .fechaNacimiento(beneficiario.getFechaNacimiento())
            .genero(beneficiario.getGenero())
            .tipoBeneficiario(beneficiario.getTipoBeneficiario())
                .estudia(beneficiario.isEstudia())
                .dependiente(beneficiario.isDependiente()).build();

    }

    public static Beneficiario beneficiarioDTOToBeneficiario(BeneficiarioDTO beneficiarioDTO){
        return Beneficiario.builder()
                .idBeneficiario(beneficiarioDTO.getIdBeneficiario())
                .tipoCedula(beneficiarioDTO.getTipoCedula())
                .cedula(beneficiarioDTO.getCedula())
                .nombres(beneficiarioDTO.getNombres())
                .apellidos(beneficiarioDTO.getApellidos())
                .fechaNacimiento(beneficiarioDTO.getFechaNacimiento())
                .genero(beneficiarioDTO.getGenero())
                .tipoBeneficiario(beneficiarioDTO.getTipoBeneficiario())
                .estudia(beneficiarioDTO.isEstudia())
                .dependiente(beneficiarioDTO.isDependiente()).build();

    }
    public static List<Beneficiario> beneficiarioDTOToBeneficiarios(List<BeneficiarioDTO> beneficiarios){
        return beneficiarios.stream()
                .map(BeneficiarioMapper::beneficiarioDTOToBeneficiario)
                .collect(Collectors.toList());
    }

    public static List<BeneficiarioDTO> beneficiariosToBeneificiarioDTO(List<Beneficiario> beneficiarios){
        return beneficiarios.stream()
                .map(BeneficiarioMapper::beneficiarioToBeneficiarioDTO)
                .collect(Collectors.toList());
    }
}
