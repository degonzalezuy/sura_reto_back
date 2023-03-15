package co.com.sofka.arusapp.jpa.causante;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface CausanteDataRepository extends CrudRepository
<CausanteDTO, Integer>, QueryByExampleExecutor <CausanteDTO>{

}
