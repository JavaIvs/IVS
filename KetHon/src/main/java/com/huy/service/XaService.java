package com.huy.service;

import java.util.List;

import com.huy.domain.Xa;

public interface XaService {

    Iterable<Xa> findAll();

    List<Xa> search(String q);
    
    Xa findOne(int id);

    void save(Xa xa);

    void delete(int id);

}