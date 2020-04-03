package cs_utec.cs2901.controller;
import cs_utec.cs2901.business.DailyCasesBusiness;
import cs_utec.cs2901.Data.DailyCases;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dailycases")
public class DailyCasesController {
    @Autowired
    private DailyCasesBusiness business;

    @PostMapping(value ="/")
    public DailyCases create(@RequestBody DailyCases item){
        return business.create(item);
    }

    @GetMapping(value = "/")
    public List<DailyCases> read(){
        return business.readAll();
    }

    @PutMapping("/{id}")
    public DailyCases update(
        @PathVariable Long id,
        @RequestBody DailyCases item
    ){
        return  business.update(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        business.delete(id);
    } 


}