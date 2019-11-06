package springAopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
* @author blw
* @version ����ʱ�䣺2019��10��29�� ����4:17:41
* ��˵��   �����ࣺע���������
*/
@Aspect
public class MyAspectAnno {
	
		// �����ע�⣺
		@Pointcut(value="execution(* springAopAnno.OrderDao.save(..))")
		private void pointcut1(){}
		@Pointcut(value="execution(* springAopAnno.OrderDao.find(..))")
		private void pointcut2(){}
		
		@Before(value="MyAspectAnno.pointcut1()")
		public void before(){
			System.out.println("ǰ����ǿ");
		}
		
		// ����֪ͨ:
		@AfterReturning(value="MyAspectAnno.pointcut1()",returning="result")
		public void afterReturning(Object result){
			System.out.println("������ǿ");
		}
		
		// ����֪ͨ:
		@Around(value="MyAspectAnno.pointcut1()")
		public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
			System.out.println("����ǰ��ǿ");
			Object obj  = joinPoint.proceed();
			System.out.println("���ƺ���ǿ");
			return obj;
		}
		
		// �쳣�׳�֪ͨ:
		@AfterThrowing(value="MyAspectAnno.pointcut2()",throwing="e")
		public void afterThrowing(Throwable e){
			System.out.println("�쳣�׳�========="+e.getMessage());
		}
		
		// ����֪ͨ
		@After(value="MyAspectAnno.pointcut2()")
		public void after(){
			System.out.println("������ɣ�");
		}
		
}
