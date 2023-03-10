package co.com.sofka.arusapp.model.renta.gateways;

import co.com.sofka.arusapp.model.renta.Renta;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RentaRepository {
    Mono<Renta>guardarRenta(Renta renta);
    Flux<Renta> findAll();
    Mono<Renta>findById(int id);
}
