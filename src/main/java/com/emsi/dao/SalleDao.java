package com.emsi.dao;

import com.emsi.entities.Salle;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.emsi.util.HibrnateUtil;

import org.hibernate.query.Query;
import java.util.List;

public class SalleDao implements Idao<Salle>{
    @Override
    public boolean create(Salle salle) {
        Transaction tx = null;
        try(Session session = HibrnateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.save(salle);
            tx.commit();
            return true;
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Salle salle) {
        Transaction tx = null;
        try(Session session = HibrnateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.update(salle);
            tx.commit();
            return true;
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Salle salle) {
        Transaction tx = null;
        try(Session session = HibrnateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.delete(salle);
            tx.commit();
            return true;
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Salle getById(int id) {
        try (Session session = HibrnateUtil.getSessionFactory().openSession()) {
            return session.get(Salle.class, id);
        }
    }
    @Override
    public List<Salle> getAll() {
        try (Session session = HibrnateUtil.getSessionFactory().openSession()) {
            Query<Salle> query = session.createQuery("SELECT s FROM Salle s", Salle.class);
            return query.getResultList();
        }
    }
}
