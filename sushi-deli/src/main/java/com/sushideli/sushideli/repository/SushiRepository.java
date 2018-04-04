package com.sushideli.sushideli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushideli.sushideli.domain.Sushi;

public interface SushiRepository extends JpaRepository<Sushi, Long> {

}
