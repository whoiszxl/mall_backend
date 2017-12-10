/**
 * 
 */
package com.whoiszxl.domain;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String name;
	
	@Transient //不对应到数据库
	private String xyz;
	
	@OneToMany(mappedBy = "category") //分类对书 一对多,放弃一对多的管理关系
	private List<Book> books;

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

	public String getXyz() {
		return xyz;
	}

	public void setXyz(String xyz) {
		this.xyz = xyz;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	
	
	
	
}
