package only_jav;

public class Tester1 {
	public static void main(String[] args) {
		String color = "Black";
		Sim sim = new Airtel();

		Mobile1 mobile = new Mobile1();
		mobile.setColor(color);
		mobile.setSim(sim);
		System.out.println(mobile);

		Mobile1 mobile2 = new Mobile1();
		mobile2.setColor(color);
		mobile2.setSim(sim);
		System.out.println(mobile2);

		Mobile1 mobile3 = new Mobile1();
		mobile3.setColor(color);
		mobile3.setSim(sim);
		System.out.println(mobile3);

	}
}

//