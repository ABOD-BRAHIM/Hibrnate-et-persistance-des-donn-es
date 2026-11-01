package com.emsi.services;

import com.emsi.dao.Idao;
import com.emsi.dao.MachineDao;
import com.emsi.entities.Machine;

import java.util.List;

public class MachineService implements Idao<Machine> {

    private Idao<Machine> dao = new MachineDao();

    @Override
    public boolean create(Machine machine) {
        return dao.create(machine);
    }

    @Override
    public boolean update(Machine machine) {
        return dao.update(machine);
    }

    @Override
    public boolean delete(Machine machine) {
        return dao.delete(machine);
    }

    @Override
    public Machine getById(int id) {
        return dao.getById(id);
    }

    @Override
    public List<Machine> getAll() {
        return dao.getAll();
    }
}
