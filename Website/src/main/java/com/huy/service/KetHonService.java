package com.huy.service;

import java.util.List;

import com.huy.domain.KetHon;

public interface KetHonService {

    Iterable<KetHon> findAll();

    List<KetHon> search(String q);

    KetHon findOne(int id);

    void save(KetHon kethon);

    void delete(int id);

}