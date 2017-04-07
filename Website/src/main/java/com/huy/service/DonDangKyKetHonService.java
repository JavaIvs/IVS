package com.huy.service;

import java.util.List;

import com.huy.domain.DonDangKyKetHon;

public interface DonDangKyKetHonService {

    Iterable<DonDangKyKetHon> findAll();

    List<DonDangKyKetHon> search(String q);

    DonDangKyKetHon findOne(int id);

    void save(DonDangKyKetHon dondangkykethon);

    void delete(int id);

}