/**
 * 
 */
package com.whoiszxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.whoiszxl.support.BookShopRepositoryImpl;

/**
 * @author zxlvoid
 *
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BookShopRepositoryImpl.class)
public class BookShopApplication {
	
	public static void main(String[] args) {
		//启动一个springboot项目，使用当前类作为入口
		SpringApplication.run(BookShopApplication.class, args);
	}

}
 