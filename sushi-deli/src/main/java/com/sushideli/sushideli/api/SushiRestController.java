package com.sushideli.sushideli.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushideli.sushideli.domain.Sushi;
import com.sushideli.sushideli.service.SushiService;

@RestController
@RequestMapping("/api/v1/sushis")
public class SushiRestController {
	@Autowired
	SushiService sushiService;
	
	// スシ全件取得
	@GetMapping
	List<Sushi> getSushis() {
		List<Sushi> sushis = sushiService.findAll();
		return sushis;
	}
	
	// スシ１件取得
	@GetMapping(path = "{sushi_id}")
	Optional<Sushi> getSushi(@PathVariable Long sushi_id) {
		Optional<Sushi> sushi = sushiService.findBySushiId(sushi_id);
		return sushi;
	}
}
