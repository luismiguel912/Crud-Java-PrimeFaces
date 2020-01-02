/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Asignaturas;
import org.hibernate.Session;
import persistencia.NewHibernateUtil;

/**
 *
 * @author luis
 */
public class asignaturaDaoImplement implements asignaturaDAO{

    @Override
    public void crearAsignatura(Asignaturas asignatura) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(asignatura);
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
    public void eliminaAsignatura(Asignaturas asignatura) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(asignatura);
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
    public void actualizaAsignatura(Asignaturas asignatura) {
        Session session  = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(asignatura);
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
