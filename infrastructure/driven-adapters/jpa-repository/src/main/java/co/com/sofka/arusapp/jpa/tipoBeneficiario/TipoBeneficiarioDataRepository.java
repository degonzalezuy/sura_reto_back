package co.com.sofka.arusapp.jpa.tipoBeneficiario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface TipoBeneficiarioDataRepository extends CrudRepository<TipoBeneficiarioDTO, Integer>, QueryByExampleExecutor<TipoBeneficiarioDTO> {
}
