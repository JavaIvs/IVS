package com.huy.service;

import java.util.List;

import com.huy.domain.DanToc;

public interface DanTocService {

    Iterable<DanToc> findAll();

    List<DanToc> search(String q);
    
    DanToc findOne(int id);

    void save(DanToc dantoc);

    void delete(int id);

}