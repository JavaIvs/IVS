package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.DonDangKyKetHon;

public interface DonDangKyKetHonRepository extends CrudRepository<DonDangKyKetHon, Integer> {

    List<DonDangKyKetHon> findByNameContaining(String q);

}