/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.profesorDAO;
import DAO.profesorDaoImplement;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Alumno;
import model.Profesor;

/**
 *
 * @author luis
 */
//@Named(value = "profesorBean")
//@Dependent
@ManagedBean
@ViewScoped
public class profesorBean {
    private Profesor profesore;

    public Profesor getProfesore() {
        return profesore;
    }

    public void setProfesore(Profesor profesore) {
        this.profesore = profesore;
    }
    

    /**
     * Creates a new instance of profesorBean
     */
    public profesorBean() {
        profesore = new Profesor();
    }
    
    public void Insertar(){
        profesorDAO dao = new  profesorDaoImplement();
        dao.crearProfesor(profesore);
        profesore = new Profesor();
    }
    
    public void Elimina(){
        profesorDAO dao = new  profesorDaoImplement();
        dao.eliminaProfesor(profesore);
        profesore = new Profesor();
    }
    
    public void Actualiza(){
        profesorDAO dao = new  profesorDaoImplement();
        dao.actualizaProfesor(profesore);
        profesore = new Profesor();
    }
    
}
