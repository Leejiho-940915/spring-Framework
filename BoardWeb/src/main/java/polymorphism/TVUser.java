package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
		TV tv = (TV) factory.getBean("lgtv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. Spring �����̳ʸ� �����Ѵ�.
		factory.close();
		
		/*
		 * 1. TVUser Ŭ���̾�Ʈ�� ������ ���� ������ �ε��Ͽ� �����̳� ����
		 * 2. ������ ���� ���Ͽ� <bean> ��ϵ� SamsungTV ��ü ����
		 * 3. getBean() �޼ҵ�� �̸��� 'tv'�� ��ü�� ��û(Lookup)
		 * 4. SamsungTV ��ü ��ȯ
		 */

	}

}
