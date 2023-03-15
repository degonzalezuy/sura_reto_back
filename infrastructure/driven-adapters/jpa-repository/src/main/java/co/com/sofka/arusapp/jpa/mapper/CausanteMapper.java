package co.com.sofka.arusapp.jpa.mapper;

import co.com.sofka.arusapp.jpa.causante.CausanteDTO;
import co.com.sofka.arusapp.model.causante.Causante;

public class CausanteMapper {

    public static CausanteDTO causanteToCausanteDTO(Causante causante){
        return CausanteDTO.builder()
                .id(causante.getId())
                .nombres(causante.getNombres())
                .apellidos(causante.getApellidos())
                .cedula(causante.getCedula())
                .fechaNacimiento(causante.getFechaNacimiento())
                .beneficiario(causante.getBeneficiario())
                .tipoCedula(causante.getTipoCedula())
                .genero(causante.getGenero())
                .asesor(causante.getAsesor())
                .build();
    }

    public static Causante causanteDTOToCausante(CausanteDTO causanteDTO){
        return Causante.builder()
                .id(causanteDTO.getId())
                .nombres(causanteDTO.getNombres())
                .apellidos(causanteDTO.getApellidos())
                .cedula(causanteDTO.getCedula())
                .fechaNacimiento(causanteDTO.getFechaNacimiento())
                .beneficiario(causanteDTO.getBeneficiario())
                .tipoCedula(causanteDTO.getTipoCedula())
                .genero(causanteDTO.getGenero())
                .asesor(causanteDTO.getAsesor())
                .build();
    }
}


