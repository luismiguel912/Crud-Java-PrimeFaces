/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.alumnoDAO;
import DAO.alumnoDaoImplement;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Alumno;

/**
 *
 * @author luis
 */
//@Named(value = "alumnoBean")
//@Dependent

@ManagedBean
@ViewScoped
public class alumnoBean {
    private Alumno alumnos;

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Creates a new instance of alumnoBean
     */
    public alumnoBean() {
        alumnos = new Alumno();
    }
    public void Insertar(){
        alumnoDAO dao = new  alumnoDaoImplement();
        dao.crearAlumno(alumnos);
        alumnos = new Alumno();
    }
    
    public void Elimina(){
        alumnoDAO dao = new  alumnoDaoImplement();
        dao.eliminaAlumno(alumnos);
        alumnos = new Alumno();
    }
    
    public void Actualiza(){
        alumnoDAO dao = new  alumnoDaoImplement();
        dao.actualizaAlumno(alumnos);
        alumnos = new Alumno();
    }
    
}
