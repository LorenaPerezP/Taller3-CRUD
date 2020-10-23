package co.edu.konrad.crudusuarios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.edu.konrad.crudusuarios.commons.GenericServiceImpl;
import co.edu.konrad.crudusuarios.model.Persona;
import co.edu.konrad.crudusuarios.repository.PersonaRepository;
import co.edu.konrad.crudusuarios.service.api.PersonaServiceAPI;
import co.edu.konrad.crudusuarios.service.impl.PersonaServiceImpl;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {
    @Autowired
    private PersonaRepository personaDaoAPI;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDaoAPI;
    }
}
