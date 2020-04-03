package cs_utec.cs2901.business;

import cs_utec.cs2901.Data.DailyCases;
import cs_utec.cs2901.repositories.DailyCasesRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional


public class DailyCasesBusiness {
    @Autowired
    private DailyCasesRepository repository;
    

    /**
     * Create: Guarda un nuevo Daily Case
     * @param newDailyCases
     * @return DailyCase guardado
     */
    public DailyCases create(DailyCases newDailyCases){
        return repository.save(newDailyCases);
    }


    /**
     * Read: Obtiene todos los daily cases 
     * @return dailycases
     */
    public List<DailyCases> readAll(){
        List<DailyCases> items = new ArrayList<>();
        for(DailyCases item:repository.findAll()){
            items.add(item);
        }
        return items;
    }

    /**
     * Update Actualiza el daily case existente
     * @param item
     * @return Dailycase actualizado 
     */
    public DailyCases update(DailyCases item){
        DailyCases a = repository.findById(item.getId()).get();
        if(a!=null){
            repository.save(item);
        }
        return null;
    }

    /**
     * Delete: Elimina un DailyCase existente
     * @param id
     */
    public void delete(Long id){
        repository.deleteById(id);
    }
}