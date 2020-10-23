package co.edu.konrad.crudusuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.konrad.crudusuarios.model.Deporte;

@Repository
public interface DeporteRepository extends CrudRepository<Deporte, Long>{
    //CrudRepository permite generar los métodos de CRUD en un repositorio
    //para ello usa la clase Deporte y el tipo de dato
}