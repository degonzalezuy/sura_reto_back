package co.com.sofka.arusapp.model.genero.gateways;

import co.com.sofka.arusapp.model.causante.Causante;
import co.com.sofka.arusapp.model.genero.Genero;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GeneroRepository {
    Mono<Genero> saveGenero(Genero genero);
    Flux<Genero> findAll();
    Mono<Genero>findById(int id);

}
