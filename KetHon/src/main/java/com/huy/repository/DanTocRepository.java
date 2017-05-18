package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.DanToc;

public interface DanTocRepository extends CrudRepository<DanToc, Integer> {

    List<DanToc> findByNameContaining(String q);
}