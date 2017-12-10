/**
 * 
 */
package com.whoiszxl.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.whoiszxl.enums.Sex;

/**
 * @author zxlvoid
 *
 */
@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@Column(columnDefinition = "INT(3)")//生成的SQL参数
	private int age;
	
	@Temporal(TemporalType.DATE) //生成Date类型
	private Date birthday;
	
	@Enumerated(EnumType.STRING)//枚举以字符串形式存储
	@Column(length = 2,nullable = true)
	private Sex sex;
	
	//@Embedded //被注入 映射对象
	//private Address address;
	
	@ElementCollection //映射集合，会新建一张表，作为一对多的关系
	private List<String> hobbies;
	
	@ElementCollection //映射对象，新建一张带Adress属性的表
	private List<Address> addresses;

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
