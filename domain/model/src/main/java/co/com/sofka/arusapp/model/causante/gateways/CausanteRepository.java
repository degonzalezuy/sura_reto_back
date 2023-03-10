package co.com.sofka.arusapp.model.causante.gateways;

import co.com.sofka.arusapp.model.causante.Causante;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CausanteRepository {
    Mono<Causante>saveCausante(Causante causante);
    Flux<Causante> findAll();
    Mono<Causante>findById(int id);

    Mono<Boolean> verificarCausanteSBDCPC(String tipoIdentificacion, int identificacion);

}
