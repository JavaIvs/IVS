package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.DanToc;
import com.huy.repository.DanTocRepository;

@Service
public class DanTocServiceImpl implements DanTocService {

	@Autowired
	private DanTocRepository dantocRepository;

	@Override
	public Iterable<DanToc> findAll() {
		// TODO Auto-generated method stub
		return dantocRepository.findAll();
	}

	@Override
	public List<DanToc> search(String q) {
		// TODO Auto-generated method stub
		return dantocRepository.findByNameContaining(q);
	}

	@Override
	public DanToc findOne(int id) {
		// TODO Auto-generated method stub
		return dantocRepository.findOne(id);
	}

	@Override
	public void save(DanToc dantoc) {
		// TODO Auto-generated method stub
		dantocRepository.save(dantoc);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dantocRepository.delete(id);
	}

}