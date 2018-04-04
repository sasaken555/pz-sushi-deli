package com.sushideli.sushideli.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sushideli.sushideli.domain.Sushi;
import com.sushideli.sushideli.repository.SushiRepository;

@Service
@Transactional
public class SushiService {
	@Autowired
	SushiRepository sushiRepository;
	
	public List<Sushi> findAll() {
		return sushiRepository.findAll();
	}
	
	public Optional<Sushi> findBySushiId(Long sushi_id) {
		return sushiRepository.findById(sushi_id);
	}
	
	public Sushi create(Sushi sushi) {
		return sushiRepository.save(sushi);
	}
	
	public Sushi update(Sushi sushi) {
		return sushiRepository.save(sushi);
	}
	
	public void delete(Long sushi_id) {
		sushiRepository.deleteById(sushi_id);
	}
}
