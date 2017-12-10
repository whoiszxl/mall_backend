package com.whoiszxl.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author zxlvoid
 *
 */
@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY) //图书对分类，为多对一,懒加载
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
		
}
