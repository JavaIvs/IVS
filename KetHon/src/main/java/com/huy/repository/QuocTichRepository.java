package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.QuocTich;

public interface QuocTichRepository extends CrudRepository<QuocTich, Integer> {

    List<QuocTich> findByNameContaining(String q);
}