package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.Xa;

public interface XaRepository extends CrudRepository<Xa, Integer> {

    List<Xa> findByNameContaining(String q);
}