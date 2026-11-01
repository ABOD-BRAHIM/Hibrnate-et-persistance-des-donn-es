package com.emsi.services;

import com.emsi.dao.Idao;
import com.emsi.dao.SalleDao;
import com.emsi.entities.Salle;

import java.util.List;

public class SalleService implements Idao<Salle> {

    private Idao<Salle> dao = new SalleDao();

    @Override
    public boolean create(Salle salle) {
        return dao.create(salle);
    }

    @Override
    public boolean update(Salle salle) {
        return dao.update(salle);
    }

    @Override
    public boolean delete(Salle salle) {
        return dao.delete(salle);
    }

    @Override
    public Salle getById(int id) {
        return dao.getById(id);
    }

    @Override
    public List<Salle> getAll() {
        return dao.getAll();
    }
}
