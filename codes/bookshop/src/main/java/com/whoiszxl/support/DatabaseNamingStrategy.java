package com.whoiszxl.support;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.spi.MetadataBuildingContext;

/**
 * 
 * @author zxlvoid
 * 数据库表名列名生成策略
 */
public class DatabaseNamingStrategy extends ImplicitNamingStrategyJpaCompliantImpl{

	private static final long serialVersionUID = -1925731877854275194L;

	@Override
	protected Identifier toIdentifier(String stringForm, MetadataBuildingContext buildingContext) {
		return super.toIdentifier(stringForm, buildingContext);
	}
}
