package co.com.sofka.arusapp.jpa.beneficiario;

import co.com.sofka.arusapp.jpa.causante.CausanteDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface BeneficiarioDataRepository extends CrudRepository <BeneficiarioDTO, Integer>, QueryByExampleExecutor<BeneficiarioDTO> {
}
