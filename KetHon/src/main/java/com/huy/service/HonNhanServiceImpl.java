package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.HonNhan;
import com.huy.repository.HonNhanRepository;

@Service
public class HonNhanServiceImpl implements HonNhanService {

	@Autowired
	private HonNhanRepository honnhanRepository;

	@Override
	public Iterable<HonNhan> findAll() {
		// TODO Auto-generated method stub
		return honnhanRepository.findAll();
	}

	@Override
	public List<HonNhan> phanloai(String q) {
		// TODO Auto-generated method stub
		return honnhanRepository.findByTrangthaiContaining(q);
	}
	
	@Override
	public List<HonNhan> search(String q) {
		// TODO Auto-generated method stub
		return honnhanRepository.findByNamhotenContaining(q);
	}
	
	@Override
	public HonNhan findOne(int id) {
		// TODO Auto-generated method stub
		return honnhanRepository.findOne(id);
	}

	@Override
	public void save(HonNhan honnhan) {
		// TODO Auto-generated method stub
		honnhanRepository.save(honnhan);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		honnhanRepository.delete(id);
	}

}