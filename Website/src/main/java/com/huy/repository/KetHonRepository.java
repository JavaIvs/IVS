package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.KetHon;

public interface KetHonRepository extends CrudRepository<KetHon, Integer> {

    List<KetHon> findByNameContaining(String q);

}