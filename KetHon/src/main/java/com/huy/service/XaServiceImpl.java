package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.Xa;
import com.huy.repository.XaRepository;

@Service
public class XaServiceImpl implements XaService {

	@Autowired
	private XaRepository xaRepository;

	@Override
	public Iterable<Xa> findAll() {
		// TODO Auto-generated method stub
		return xaRepository.findAll();
	}

	@Override
	public List<Xa> search(String q) {
		// TODO Auto-generated method stub
		return xaRepository.findByNameContaining(q);
	}

	@Override
	public Xa findOne(int id) {
		// TODO Auto-generated method stub
		return xaRepository.findOne(id);
	}

	@Override
	public void save(Xa xa) {
		// TODO Auto-generated method stub
		xaRepository.save(xa);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		xaRepository.delete(id);
	}
}