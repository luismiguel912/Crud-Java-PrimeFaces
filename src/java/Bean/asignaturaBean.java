/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.asignaturaDAO;
import DAO.asignaturaDaoImplement;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Asignaturas;

/**
 *
 * @author luis
 */
//@Named(value = "asignaturaBean")
//@Dependent
@ManagedBean
@ViewScoped
public class asignaturaBean {
    private Asignaturas asignatura;

    public Asignaturas getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }
    

    /**
     * Creates a new instance of asignaturaBean
     */
    public asignaturaBean() {
        asignatura = new Asignaturas();
    }
    
     public void Insertar(){
        asignaturaDAO dao = new  asignaturaDaoImplement();
        dao.crearAsignatura(asignatura);
        asignatura = new Asignaturas();
    }
    
     public void Elimina(){
        asignaturaDAO dao = new  asignaturaDaoImplement();
        dao.eliminaAsignatura(asignatura);
        asignatura = new Asignaturas();
    }
     
     public void Actualiza(){
        asignaturaDAO dao = new  asignaturaDaoImplement();
        dao.actualizaAsignatura(asignatura);
        asignatura = new Asignaturas();
    }
}
