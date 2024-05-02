package initialize;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_demo.Car;

public class InitMethod {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("initialize/Initmethod.xml");
	System.out.println(context.getBean(Car1.class));
	System.out.println(context.getBean(Car1.class));
	System.out.println(context.getBean(Car1.class));
	System.out.println(context.getBean(Car1.class));
	
	
	System.out.println(context.getBean(Bus1.class));
	System.out.println(context.getBean(Bus1.class));
	System.out.println(context.getBean(Bus1.class));
//	System.out.println(context.getBean(Bus1.class));
}
}
