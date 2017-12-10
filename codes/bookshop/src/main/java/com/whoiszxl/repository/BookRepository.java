package com.whoiszxl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import com.whoiszxl.domain.Book;
/**
 * 
 * @author zxlvoid
 * 
 */
public interface BookRepository extends JpaRepository<Book, Long>,JpaSpecificationExecutor<Book>{//泛型参数: args1:操作实体表，args2:主键类型
	
	List<Book> findByName(String name);
}
