package com.huy.service;

import java.util.List;

import com.huy.domain.HonNhan;

public interface HonNhanService {

    Iterable<HonNhan> findAll();

    List<HonNhan> phanloai(String q);
    
    List<HonNhan> search(String q);
    
    HonNhan findOne(int id);

    void save(HonNhan honnhan);

    void delete(int id);

}