package com.huy.service;

import java.util.List;

import com.huy.domain.QuocTich;

public interface QuocTichService {

    Iterable<QuocTich> findAll();

    List<QuocTich> search(String q);
    
    QuocTich findOne(int id);

    void save(QuocTich quoctich);

    void delete(int id);

}