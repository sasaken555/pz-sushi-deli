package com.sushideli.sushideli.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sushi {
	@Id
	@GeneratedValue
	private Long sushi_id;
	@Column(nullable =false)
	private String sushi_name;
	private String sushi_description;
	private Integer sushi_price;
	private String sushi_image_path;
	private String sushi_avail_flg;
}
