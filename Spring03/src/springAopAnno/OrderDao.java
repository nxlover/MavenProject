package springAopAnno;
/**
* @author blw
* @version ����ʱ�䣺2019��10��29�� ����4:16:25
* ��˵��
*/
public class OrderDao {
	
	public void save(){
		System.out.println("���涩��...");
	}
	
	public void find(){
		System.out.println("��ѯ����...");
		int d = 1/0;
	}

}
