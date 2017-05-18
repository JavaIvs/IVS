package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.QuocTich;
import com.huy.repository.QuocTichRepository;

@Service
public class QuocTichServiceImpl implements QuocTichService {

	@Autowired
	private QuocTichRepository quoctichRepository;

	@Override
	public Iterable<QuocTich> findAll() {
		// TODO Auto-generated method stub
		return quoctichRepository.findAll();
	}

	@Override
	public List<QuocTich> search(String q) {
		// TODO Auto-generated method stub
		return quoctichRepository.findByNameContaining(q);
	}

	@Override
	public QuocTich findOne(int id) {
		// TODO Auto-generated method stub
		return quoctichRepository.findOne(id);
	}

	@Override
	public void save(QuocTich quoctich) {
		// TODO Auto-generated method stub
		quoctichRepository.save(quoctich);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		quoctichRepository.delete(id);
	}
}