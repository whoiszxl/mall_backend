package com.whoiszxl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 
 * @author zxlvoid
 *
 */
@Entity
public class AuthorInfo extends DomainImpl{

	
	private String email;
	
	@OneToOne(mappedBy = "info") //交给info管理
	private Author author;
	


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
