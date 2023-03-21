package co.com.sofka.arusapp.model.beneficiario.gateways;

import co.com.sofka.arusapp.model.beneficiario.Beneficiario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeneficiarioRepository {
    Mono<Beneficiario> guardarBeneficiario(Beneficiario beneficiario);
    Flux<Beneficiario> buscarBeneficiario();
    Mono<Beneficiario>buscarBeneficiarioPorId(int id);

    Mono<Beneficiario> actualizarBeneficiario(int id, Beneficiario beneficiario);

}
