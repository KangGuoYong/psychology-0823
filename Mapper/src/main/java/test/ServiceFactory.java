package test;

import kgy.mapper.UsersMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 康国勇
 * @Date 2022/8/25  5:02
 */
public class ServiceFactory {
	private static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
	}

	public static <T> T getBean(Class<T> tClass){
		return context.getBean(tClass);
	}

	public static Object getBean(String beanId){
		return context.getBean(beanId);
	}

}
