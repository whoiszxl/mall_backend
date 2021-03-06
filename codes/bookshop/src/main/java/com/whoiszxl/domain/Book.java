package com.whoiszxl.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Version;

/**
 * 
 * @author zxlvoid
 *
 */
@Entity
@NamedEntityGraph(name = "Book.fetch.category.and.author",
attributeNodes = {@NamedAttributeNode("category"),@NamedAttributeNode("authors")})
public class Book extends DomainImpl{
	
	private String name;
	
	@ManyToOne //图书对分类，为多对一,懒加载
	private Category category;

	@OneToMany(mappedBy = "book")
	private List<BookAuthor> authors;
	
	@Version
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<BookAuthor> getAuthors() {
		return authors;
	}

	public void setAuthors(List<BookAuthor> authors) {
		this.authors = authors;
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
