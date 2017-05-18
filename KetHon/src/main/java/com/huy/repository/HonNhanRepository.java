package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.HonNhan;

public interface HonNhanRepository extends CrudRepository<HonNhan, Integer> {

    List<HonNhan> findByTrangthaiContaining(String q);
    List<HonNhan> findByNamhotenContaining(String q);
}