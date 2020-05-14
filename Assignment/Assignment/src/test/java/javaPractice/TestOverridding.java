package javaPractice;

public class TestOverridding {

	public static void main(String[] args) {
		Bmw b=new Bmw();
		Car c=new Car();
		//c.addfuel();
		//c.start();
		//c.stop();
		
		
		//b.start();
		Car.start();
		Bmw.start();
		b.addfuel();
		b.stop();

	}

}
//STATIC METHODS ARE NOT OVERRIDDEN BECAUSE IT IS COMMON FOR ALL OBJECTS.IT IS NOT STORED IN ANY OBJECT SPECIFIC MEMORY LOCATION.SO WE CAN CALL THE STATIC METHOD USING CLASS NAME