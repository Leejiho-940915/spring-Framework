package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		TV tv = (TV) factory.getBean("lgtv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();
		
		/*
		 * 1. TVUser 클라이언트가 스프링 설정 파일을 로딩하여 컨테이너 구동
		 * 2. 스프링 설정 파일에 <bean> 등록된 SamsungTV 객체 생성
		 * 3. getBean() 메소드로 이름이 'tv'인 객체를 요청(Lookup)
		 * 4. SamsungTV 객체 반환
		 */

	}

}
