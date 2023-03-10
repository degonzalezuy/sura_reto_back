package co.com.sofka.arusapp.model.causante.gateways;

import co.com.sofka.arusapp.model.causante.Causante;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CausanteRepository {
    Mono<Causante>guardarCausante(Causante causante);
    Flux<Causante> findAll();
    Mono<Causante>findById(int id);
}
