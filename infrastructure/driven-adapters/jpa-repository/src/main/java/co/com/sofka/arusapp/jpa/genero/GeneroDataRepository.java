package co.com.sofka.arusapp.jpa.genero;

import co.com.sofka.arusapp.jpa.beneficiario.BeneficiarioDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface GeneroDataRepository extends CrudRepository<GeneroDTO, Integer>, QueryByExampleExecutor<GeneroDTO>{

}
