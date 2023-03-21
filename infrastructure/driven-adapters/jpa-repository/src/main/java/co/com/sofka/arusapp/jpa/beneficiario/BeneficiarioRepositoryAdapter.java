package co.com.sofka.arusapp.jpa.beneficiario;

import co.com.sofka.arusapp.jpa.causante.CausanteDTO;
import co.com.sofka.arusapp.jpa.helper.AdapterOperations;
import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import co.com.sofka.arusapp.model.beneficiario.gateways.BeneficiarioRepository;
import net.bytebuddy.build.BuildLogger;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

import static co.com.sofka.arusapp.jpa.mapper.BeneficiarioMapper.*;
import static co.com.sofka.arusapp.jpa.mapper.CausanteMapper.causanteDTOToCausante;
import static co.com.sofka.arusapp.jpa.mapper.CausanteMapper.causantesDTOToCausantes;

@Repository
public class BeneficiarioRepositoryAdapter extends AdapterOperations<Beneficiario, BeneficiarioDTO,
        Integer, BeneficiarioDataRepository> implements BeneficiarioRepository {

    public BeneficiarioRepositoryAdapter(BeneficiarioDataRepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Beneficiario.BeneficiarioBuilder.class).build());
    }

    @Override
    public Mono<Beneficiario> guardarBeneficiario(Beneficiario beneficiario) {
        if(beneficiario != null){
            BeneficiarioDTO beneficiarioDTO=beneficiarioToBeneficiarioDTO(beneficiario);
            repository.save(beneficiarioDTO);
            return Mono.just(beneficiario);
        }else{
            return Mono.empty();
        }
    }

    @Override
    public Flux<Beneficiario> buscarBeneficiario() {
        List<BeneficiarioDTO> beneficiarios = (List<BeneficiarioDTO>) repository.findAll();

        if(!beneficiarios.isEmpty()){
            return Flux.fromIterable(beneficiarioDTOToBeneficiarios(beneficiarios));
        }else {
            return Flux.empty();
        }
    }

    @Override
    public Mono<Beneficiario> buscarBeneficiarioPorId(int id) {
        Optional<BeneficiarioDTO> beneficiarioDTO = repository.findById(id);
        return beneficiarioDTO.map(data -> Mono.just(beneficiarioDTOToBeneficiario(data)))
                .orElseGet(Mono::empty);
    }

    //TODO crear función
    @Override
    public Mono<Beneficiario> actualizarBeneficiario(int id, Beneficiario beneficiario) {
        return null;
    }
}


