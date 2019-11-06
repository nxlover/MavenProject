package proxyFactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author blw
* @version ����ʱ�䣺2019��10��30�� ����1:05:41
* ��˵��
*/
public class ProxyFactoryBeanXmlDemo {
	
	public static void main(String[] args) {
		String xmlPath = "proxyFactoryBean/applicationContext.xml";
		ApplicationContext  applicationContext= new ClassPathXmlApplicationContext(xmlPath);
		
		OrderDao orderDao = (OrderDao)applicationContext.getBean("orderDaoProxy");
		
		//ִ�з���
		orderDao.save();
	}

}
