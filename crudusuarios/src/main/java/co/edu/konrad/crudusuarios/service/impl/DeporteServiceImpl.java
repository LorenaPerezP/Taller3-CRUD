package co.edu.konrad.crudusuarios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.edu.konrad.crudusuarios.commons.GenericServiceImpl;
import co.edu.konrad.crudusuarios.model.Deporte;
import co.edu.konrad.crudusuarios.repository.DeporteRepository;
import co.edu.konrad.crudusuarios.service.api.DeporteServiceAPI;
import co.edu.konrad.crudusuarios.service.impl.DeporteServiceImpl;

@Service
public class DeporteServiceImpl extends GenericServiceImpl<Deporte, Long> implements DeporteServiceAPI {
    @Autowired
    private DeporteRepository deporteDaoAPI;

    @Override
    public CrudRepository<Deporte, Long> getDao() {
        return deporteDaoAPI;
    }
}
