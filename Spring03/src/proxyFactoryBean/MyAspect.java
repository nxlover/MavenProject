package proxyFactoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
* @author blw
* @version ����ʱ�䣺2019��10��30�� ����12:43:06
* ��˵��
*/
public class MyAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("������!");
		
		Object obj = mi.proceed(); 
		
		System.out.println("�ύ����!");
		return obj;
	}

}
