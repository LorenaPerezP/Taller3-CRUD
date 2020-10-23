package co.edu.konrad.crudusuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.konrad.crudusuarios.model.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
    //CrudRepository permite generar los métodos de CRUD en un repositorio
    //para ello usa la clase Persona y el tipo de dato
}
