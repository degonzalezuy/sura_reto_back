package co.com.sofka.arusapp.jpa.renta;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RentaDataRepository extends CrudRepository<RentaDTO, Integer>, QueryByExampleExecutor<RentaDTO> {
}
