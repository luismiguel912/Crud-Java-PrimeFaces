/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Asignaturas;

/**
 *
 * @author luis
 */
public interface asignaturaDAO {
    public void crearAsignatura(Asignaturas asignatura);
    public void eliminaAsignatura(Asignaturas asignatura);
    public void actualizaAsignatura(Asignaturas asignatura);
    
}
