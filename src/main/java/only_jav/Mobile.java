package only_jav;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Mobile {
	
//	@PostConstruct
//	void insertSim()
//	{
//		System.out.println("sim inserted");
//	}
//	@PreDestroy
//	void removeSim()
//	{
//		System.out.println("sim inserted");
//		
//	}
	@Value("one plus")
	private String mobilebrand;
	@Value("4")
	private int cost;
	
	
	@Override
	public String toString() {
		return "Mobile [mobilebrand=" + mobilebrand + ", cost=" + cost + "]";
	}
	
//	@Value("oneplus")  //setter injection
//	public void setMobilebrand(String mobilebrand) {
//		this.mobilebrand = mobilebrand;
//	}
//	
//	@Value("5")
//		public void setCost(int cost) {
//		this.cost = cost;
//	}
	
	
	
	//constructor injection

//public Mobile(@Value("one plus") String mobilebrand, @Value("5") int cost) {
//	super();
//	this.mobilebrand = mobilebrand;
//	this.cost = cost;
//}
	
	
	
}
