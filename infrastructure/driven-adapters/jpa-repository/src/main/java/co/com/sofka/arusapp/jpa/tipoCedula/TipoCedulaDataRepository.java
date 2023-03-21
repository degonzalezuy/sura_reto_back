package co.com.sofka.arusapp.jpa.tipoCedula;

import co.com.sofka.arusapp.jpa.genero.GeneroDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface TipoCedulaDataRepository extends CrudRepository<TipoCedulaDTO, Integer>, QueryByExampleExecutor<TipoCedulaDTO> {
}
