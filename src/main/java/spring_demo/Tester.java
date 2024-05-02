package spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Tester 
{
	public static void main(String[] args)
	{		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("NewFile.xml"));
		System.out.println(factory.getBean(Car.class));
		System.out.println(factory.getBean(Bus.class));
	}
}
