package co.com.sofka.arusapp.usecase.causante;

import co.com.sofka.arusapp.model.causante.Causante;
import co.com.sofka.arusapp.model.causante.gateways.CausanteRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CausanteUseCase {

    private final CausanteRepository causanteRepository;
    //private final CausantePublicador causantePublicador

    public Flux<Causante> buscarCausantes(){
        return causanteRepository.buscarCausantes();
    }

    public Mono<Causante> buscarCausantePorId(Integer id){
        return causanteRepository.buscarCausantePorId(id);
    }

    public Mono<Causante> crearCausante(Causante causante){
        return causanteRepository.saveCausante(causante);
    }

    /*public Mono<String> buscarPersonasPorComando(){
        return personaPublicador.publicarPersonasViajeras();
    }**/
}
