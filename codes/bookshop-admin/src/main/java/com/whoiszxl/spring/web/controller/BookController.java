package com.whoiszxl.spring.web.controller;

import static org.mockito.Matchers.contains;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whoiszxl.spring.dto.BookCondition;
import com.whoiszxl.spring.dto.BookInfo;

/**
 * @author zxlvoid
 *
 */
@RestController
@RequestMapping("/book")
public class BookController {
	
	@GetMapping()
	public List<BookInfo> query(BookCondition condition, @PageableDefault(size = 10) Pageable pageable){
		System.out.println(condition.getKeyword());
		System.out.println(pageable.getPageNumber());//获取页数
		System.out.println(pageable.getPageSize());//获取每页大小
		System.out.println(pageable.getSort());//获取排序
		
		ArrayList<BookInfo> books = new ArrayList<BookInfo>();
		books.add(new BookInfo());
		books.add(new BookInfo());
		books.add(new BookInfo());
		return books;
	}
	
	@GetMapping("/{id}")
	public BookInfo getInfo(@PathVariable Long id) {
		BookInfo bookInfo = new BookInfo();
		bookInfo.setName("绿毛水怪");
		return bookInfo;
	}
}
