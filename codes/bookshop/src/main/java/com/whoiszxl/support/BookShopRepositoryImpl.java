package com.whoiszxl.support;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
/**
 * 
 * @author zxlvoid
 *
 * @param <T>
 */
public class BookShopRepositoryImpl<T> extends SimpleJpaRepository<T, Long> {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public BookShopRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public <S extends T> S save(S entity) {//可以做一些切面的操作
		logger.info("save：：：：" + entity.getClass().getSimpleName());
		return super.save(entity);
	}

}
