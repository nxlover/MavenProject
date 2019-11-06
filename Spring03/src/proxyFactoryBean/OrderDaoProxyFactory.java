package proxyFactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
* @author blw
* @version ����ʱ�䣺2019��10��30�� ����11:55:25
* ��˵��
*/

public class OrderDaoProxyFactory implements InvocationHandler{

	public OrderDaoProxyFactory(OrderDao or) {
		super();
		this.or = or;
	}

	private OrderDao or;
	
	public OrderDao getUserServiceProxy() {
		// ���ɶ�̬����
		OrderDao proxy = (OrderDao) Proxy.newProxyInstance(OrderDaoProxyFactory.class.getClassLoader(),
				OrderDaoImpl.class.getInterfaces(), this);
		// ����
		return proxy;

	}

	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		System.out.println("������!");
		Object invoke = method.invoke(or, arg2); 
		System.out.println("�ύ����!");
		return invoke;
	}
}
