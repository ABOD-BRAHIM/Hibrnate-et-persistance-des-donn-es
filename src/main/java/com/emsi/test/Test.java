package com.emsi.test;

import com.emsi.dao.Idao;
import com.emsi.dao.MachineDao;
import com.emsi.entities.Machine;
import com.emsi.entities.Salle;
import com.emsi.services.MachineService;
import com.emsi.services.SalleService;

public class Test {
    public static void main(String[] args) {

        Idao<Machine> dao = new MachineDao();

        if(dao instanceof MachineDao){
            System.out.println(((MachineDao) dao).findByMarque("Dell").get(0).getRef());
        }


    }
}
