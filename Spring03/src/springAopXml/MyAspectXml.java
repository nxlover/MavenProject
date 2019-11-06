package springAopXml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
* @author blw
* @version ����ʱ�䣺2019��10��30�� ����9:23:36
* ��˵��
*/
public class MyAspectXml {

	// ǰ����ǿ
	public void before(){
	System.out.println("ǰ����ǿ");
	}
	
	//������ǿ
	public void after(){
		System.out.println("������ǿ");
	}
	
	//����֪ͨ
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���ǻ���֪֮ͨǰ�Ĳ���!!");
		Object proceed = pjp.proceed();//����Ŀ�귽��
		System.out.println("���ǻ���֪֮ͨ��Ĳ���!!");
		return proceed;
	}
	
	//�쳣֪ͨ
	public void afterException(){
		System.out.println("������!�����쳣��!");
	}
	
	
}
