/**
 * 
 */
package com.whoiszxl;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zxlvoid
 *
 */
@RunWith(SpringRunner.class)//使用SpringRunner运行测试用例
@SpringBootTest(classes = BookShopApplication.class)//告诉程序测试的入口在哪
@Transactional//测试结束后，数据会被rollback
public class BaseTest {
	
}
