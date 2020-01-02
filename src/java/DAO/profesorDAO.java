/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Profesor;

/**
 *
 * @author luis
 */
public interface profesorDAO {
    public void crearProfesor(Profesor profesores);
    public void eliminaProfesor(Profesor profesores);
    public void actualizaProfesor(Profesor profesores);
    
}
