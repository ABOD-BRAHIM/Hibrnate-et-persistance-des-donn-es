package com.emsi.dao;

import com.emsi.entities.Machine;
import com.emsi.entities.Salle;
import com.emsi.util.HibrnateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class MachineDao implements Idao<Machine> {

    @Override
    public boolean create(Machine machine) {
        Transaction tx = null;
        try(Session session = HibrnateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.save(machine);
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
    public boolean update(Machine machine) {
        Transaction tx = null;
        try(Session session = HibrnateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.update(machine);
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
    public boolean delete(Machine machine) {
        Transaction tx = null;
        try(Session session = HibrnateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.delete(machine);
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
    public Machine getById(int id) {
        try (Session session = HibrnateUtil.getSessionFactory().openSession()) {
            return session.get(Machine.class, id);
        }
    }
    @Override
    public List<Machine> getAll() {
        try (Session session = HibrnateUtil.getSessionFactory().openSession()) {
            Query<Machine> query = session.createQuery("SELECT m FROM Machine m", Machine.class);
            return query.getResultList();
        }
    }

    public List<Machine> findByMarque(String marque){
        try (Session session = HibrnateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("SELECT m FROM Machine m WHERE m.marque = :marque", Machine.class);
            query.setParameter("marque", marque);
            return query.getResultList();
        }
    }
}
