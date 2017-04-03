package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.KetHon;
import com.huy.repository.KetHonRepository;

@Service
public class KetHonServiceImpl implements KetHonService {
	
	@Autowired
    private KetHonRepository kethonRepository;

	@Override
	public Iterable<KetHon> findAll() {
		// TODO Auto-generated method stub
		return kethonRepository.findAll();
	}

	@Override
	public List<KetHon> search(String q) {
		// TODO Auto-generated method stub
		return kethonRepository.findByNameContaining(q);
	}

	@Override
	public KetHon findOne(int id) {
		// TODO Auto-generated method stub
		return kethonRepository.findOne(id);
	}

	@Override
	public void save(KetHon kethon) {
		// TODO Auto-generated method stub
		kethonRepository.save(kethon);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		kethonRepository.delete(id);
	}
}