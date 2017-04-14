package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.DonDangKyKetHon;
import com.huy.repository.DonDangKyKetHonRepository;

@Service
public class DonDangKyKetHonServiceImpl implements DonDangKyKetHonService {

	@Autowired
	private DonDangKyKetHonRepository dondangkykethonRepository;

	@Override
	public Iterable<DonDangKyKetHon> findAll() {
		return dondangkykethonRepository.findAll();
	}

	@Override
	public List<DonDangKyKetHon> search(String q) {
		return dondangkykethonRepository.findByNameContaining(q);
	}

	@Override
	public DonDangKyKetHon findOne(int id) {
		return dondangkykethonRepository.findOne(id);
	}

	@Override
	public void save(DonDangKyKetHon dondangkykethon) {
		dondangkykethonRepository.save(dondangkykethon);
	}

	@Override
	public void delete(int id) {
		dondangkykethonRepository.delete(id);
	}

}