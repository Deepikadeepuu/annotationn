package only_jav;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyCofigaration.class);
	System.out.println(context.getBean("mobile"));
//	System.out.println(context.getBean("mobile"));
//	System.out.println(context.getBean("mobile"));
	
//context.isPrototype("mobile");
//	System.out.println(context.isSingleton("mobile"));-true
//	System.out.println(context.containsBean("mobile"));
//	System.out.println(context.getBean("mobile"));
}
}
