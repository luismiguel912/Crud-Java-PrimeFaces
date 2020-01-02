/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Profesor;
import org.hibernate.Session;
import persistencia.NewHibernateUtil;

/**
 *
 * @author luis
 */
public class profesorDaoImplement implements profesorDAO{

    @Override
    public void crearProfesor(Profesor profesores) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(profesores);
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
    public void eliminaProfesor(Profesor profesores) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(profesores);
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
    public void actualizaProfesor(Profesor profesores) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(profesores);
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
