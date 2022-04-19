package curso.cpic.cr.localizacion.bo;

import curso.cpic.cr.localizacion.model.Provincia;

import java.util.List;
import java.util.Optional;

public interface ProvinciaBo {

    List<Provincia> findAll();
    Optional<Provincia> findById(Integer id);
    Long count();
    Provincia save(Provincia id);
    Provincia update(Provincia id);
    void deleteById(Integer id);

}
