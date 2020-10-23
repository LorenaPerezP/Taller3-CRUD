package co.edu.konrad.crudusuarios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deporte {

    @Id //marca la llave principal
    @GeneratedValue(strategy = GenerationType.AUTO) //campo autoincremental
    private Long id;

    @Column
    private String nombre_deporte;

    @Column
    private String modalidad;

    @Column
    private String num_personas_equipo;

    @Column
    private String nombre_equipo;
    
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nombre_deporte
     */
    public String getNombre_deporte() {
        return nombre_deporte;
    }

    /**
     * @param nombre_deporte the nombre_deporte to set
     */
    public void setNombre_deporte(String nombre_deporte) {
        this.nombre_deporte = nombre_deporte;
    }

    /**
     * @return String return the modalidad
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * @param modalidad the modalidad to set
     */
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    /**
     * @return String return the num_personas_equipo
     */
    public String getNum_personas_equipo() {
        return num_personas_equipo;
    }

    /**
     * @param num_personas_equipo the num_personas_equipo to set
     */
    public void setNum_personas_equipo(String num_personas_equipo) {
        this.num_personas_equipo = num_personas_equipo;
    }

    /**
     * @return String return the nombre_equipo
     */
    public String getNombre_equipo() {
        return nombre_equipo;
    }

    /**
     * @param nombre_equipo the nombre_equipo to set
     */
    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

}
