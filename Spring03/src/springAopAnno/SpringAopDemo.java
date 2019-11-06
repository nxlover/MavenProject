package springAopAnno;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
* @author blw
* @version ����ʱ�䣺2019��10��29�� ����4:20:47
* ��˵�� Spring��AOP��ע�⿪��
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/springAopAnno/applicationContext.xml")
public class SpringAopDemo {
	@Resource(name="orderDao")
	private OrderDao orderDao;
	
	@Test
	public void demo1(){
		orderDao.save();
		orderDao.find();
	}

}
