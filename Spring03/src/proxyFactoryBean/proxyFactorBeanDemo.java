package proxyFactoryBean;

import org.junit.Test;

/**
* @author blw
* @version ����ʱ�䣺2019��10��30�� ����11:51:53
* ��˵��
*/
public class proxyFactorBeanDemo {
	
	@Test
	//��̬����
	public void demo(){
		OrderDao or = new OrderDaoImpl();
		
		OrderDaoProxyFactory factory = new OrderDaoProxyFactory(or);
		
		OrderDao proxy = factory.getUserServiceProxy();
		
		proxy.save();
	}
}
