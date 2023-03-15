package co.com.sofka.arusapp.jpa.causante;

import co.com.sofka.arusapp.jpa.helper.AdapterOperations;
import co.com.sofka.arusapp.model.causante.Causante;
import co.com.sofka.arusapp.model.causante.gateways.CausanteRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class CausanteRepositoryAdapter extends AdapterOperations<Causante, CausanteDTO,
        Integer, CausanteDataRepository> implements CausanteRepository {

    public CausanteRepositoryAdapter(CausanteDataRepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Causante.CausanteBuilder.class).build());

    }

    @Override
    public Mono<Causante> saveCausante(Causante causante) {
        if(causante != null){
            CausanteDTO nuevoCausanteDTO =
        }
    }

    @Override
    public Mono<Causante> findById(int id) {
        return null;
    }

    @Override
    public Mono<Boolean> verificarCausanteSBDCPC(String tipoIdentificacion, int identificacion) {
        return null;
    }
}
