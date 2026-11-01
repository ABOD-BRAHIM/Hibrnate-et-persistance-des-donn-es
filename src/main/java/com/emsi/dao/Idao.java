package com.emsi.dao;

import java.util.List;

public interface Idao<T>{
    boolean create(T t);
    boolean update(T t);
    boolean delete(T t);
    T getById(int id);
    List<T> getAll();
}
