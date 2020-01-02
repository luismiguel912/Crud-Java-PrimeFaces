/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Alumno;
import org.hibernate.Session;
import persistencia.NewHibernateUtil;

/**
 *
 * @author luis
 */
public class alumnoDaoImplement implements alumnoDAO{

    @Override
    public void crearAlumno(Alumno alumnos) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(alumnos);
            session.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public void eliminaAlumno(Alumno alumnos) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(alumnos);
            session.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public void actualizaAlumno(Alumno alumnos) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(alumnos);
            session.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
    
    
    
}
