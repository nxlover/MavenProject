package springAopXml;
/**
* @author blw
* @version ����ʱ�䣺2019��10��30�� ����9:17:44
* ��˵��
*/
public class OrderDaoImpl implements OrderDao {

	public void save() {
		System.out.println("���涩��...");
	}

	public void find() {
		System.out.println("��ѯ����...");
		int i=1/0;
	}

}
