package co.com.sofka.arusapp.model.tipobeneficiario.gateways;

import co.com.sofka.arusapp.model.genero.Genero;
import co.com.sofka.arusapp.model.tipobeneficiario.TipoBeneficiario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoBeneficiarioRepository {
    Mono<TipoBeneficiario> saveTipoBeneficiario(TipoBeneficiario tipoBeneficiario);
    Flux<TipoBeneficiario> findAll();
    Mono<TipoBeneficiario>findById(int id);
}
