package cs_utec.cs2901.repositories;
import cs_utec.cs2901.Data.DailyCases;
import org.springframework.data.repository.CrudRepository;
/**
 
 *CRUD CREATION
 *Manejo de CRUD persistencia y trx;
 * CREATE,   Insert Into dailycases values(id_value,cantidad,"fecha");
 * READ,     SELECT * FROM dailycases WHERE id = 2; 
 * READ ALL, SELECT * FROM dailycases 
 * UPDATE,   UPDATE daylicases SET cantidad = 3 WHERE  id=5;
 * DELETE    DELETE FROM daylicass WHERE id = 3;
 */

 public interface DailyCasesRepository extends CrudRepository<DailyCases,Long>{

 }
