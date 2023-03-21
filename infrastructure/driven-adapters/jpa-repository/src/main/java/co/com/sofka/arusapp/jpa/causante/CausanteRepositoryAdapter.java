package co.com.sofka.arusapp.jpa.causante;

import co.com.sofka.arusapp.jpa.helper.AdapterOperations;
import co.com.sofka.arusapp.model.causante.Causante;
import co.com.sofka.arusapp.model.causante.gateways.CausanteRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

import static co.com.sofka.arusapp.jpa.mapper.CausanteMapper.*;

@Repository
public class CausanteRepositoryAdapter extends AdapterOperations<Causante, CausanteDTO,
        Integer, CausanteDataRepository> implements CausanteRepository {

    public CausanteRepositoryAdapter(CausanteDataRepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Causante.CausanteBuilder.class).build());

    }

    @Override
    public Mono<Causante> saveCausante(Causante causante) {
        if(causante != null){
            CausanteDTO causanteDTO = causanteToCausanteDTO(causante);
            repository.save(causanteDTO);
            return Mono.just(causante);
        }else {
            return Mono.empty();
        }
    }

    @Override
    public Flux<Causante> buscarCausantes() {
        List<CausanteDTO> causantes = (List<CausanteDTO>) repository.findAll();

        if(!causantes.isEmpty()){
            return Flux.fromIterable(causantesDTOToCausantes(causantes));
        }else {
            return Flux.empty();
        }
    }

    @Override
    public Mono<Causante> buscarCausantePorId(int id) {
        Optional<CausanteDTO> causanteDTO = repository.findById(id);
        return causanteDTO.map(data -> Mono.just(causanteDTOToCausante(data)))
                .orElseGet(Mono::empty);
    }



    //TODO crear función

    @Override
    public Mono<Boolean> verificarCausanteSBDCPC(String tipoIdentificacion, int identificacion) {
        return null;
    }
}
