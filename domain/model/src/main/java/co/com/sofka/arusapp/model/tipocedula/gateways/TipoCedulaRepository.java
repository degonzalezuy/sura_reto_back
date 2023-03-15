package co.com.sofka.arusapp.model.tipocedula.gateways;

import co.com.sofka.arusapp.model.genero.Genero;
import co.com.sofka.arusapp.model.tipocedula.TipoCedula;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoCedulaRepository {
    Mono<TipoCedula> saveTipoCedula(TipoCedula tipoCedula);
    Flux<TipoCedula> findAll();
    Mono<TipoCedula>findById(int id);
}
