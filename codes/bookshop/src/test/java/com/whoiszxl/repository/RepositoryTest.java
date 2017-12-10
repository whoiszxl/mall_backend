package com.whoiszxl.repository;

import static org.junit.Assert.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;

import com.whoiszxl.BaseTest;
import com.whoiszxl.domain.Book;

public class RepositoryTest extends BaseTest{

	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void findBookTest() throws Exception {
		bookRepository.findByName("红拂夜奔");
	}
	
	@Test
	public void testSave() throws Exception {
		Book book = new Book();
		book.setName("红拂夜奔");
		bookRepository.save(book);
	}
	
	@Test
	public void sortAndPagingTest() throws Exception {
		//bookRepository.findAll(new Sort(Direction.DESC,"name"));
		Pageable pageable = new PageRequest(0, 10, new Sort(Direction.DESC,"name"));
		bookRepository.findAll(pageable);
	}
	
	@Test
	public void dyncSelectTest() throws Exception {
		Specification<Book> spec = new Specification<Book>() {

			public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Predicate p1 = cb.equal(root.get("name"), "红拂夜奔");
				Predicate p2 = cb.equal(root.get("category").get("name"), "王小波");
				Predicate p3 = cb.and(p1,p2);//组合p1p2的查询条件到p3
				root.fetch("category", JoinType.LEFT);//设置为左连接
				return p3;
			}
		};
		
		bookRepository.findOne(spec);
	}
}
