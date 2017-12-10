/**
 * 
 */
package com.whoiszxl.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author zxlvoid
 *
 */
//@Table(name = "zxl_vategory") //设置对应的表名
@Entity //设置为数据库实体
public class Category {
	
	@Id //设置为主键ID
	@GeneratedValue //设置为自增
	private Long id;

	@Basic //字段默认basic注解
	@Column(length = 10,nullable = false,unique = true)
	private String username;
	
	@Transient //不对应到数据库
	private String xyz;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
