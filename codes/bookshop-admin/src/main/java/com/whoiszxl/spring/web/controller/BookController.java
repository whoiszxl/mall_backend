package com.whoiszxl.spring.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whoiszxl.spring.dto.BookInfo;

/**
 * @author zxlvoid
 *
 */
@RestController
public class BookController {
	
	@GetMapping("/book")
	public List<BookInfo> query(String name){
		System.out.println(name);
		ArrayList<BookInfo> books = new ArrayList<BookInfo>();
		books.add(new BookInfo());
		books.add(new BookInfo());
		books.add(new BookInfo());
		return books;
	}
}
