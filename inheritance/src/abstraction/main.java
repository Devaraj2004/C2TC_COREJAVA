package abstraction;

public class main {
	public static void main(String[]args) {
		// computer is a abstract class we cannot create object for it
		//computer co=new computer();
		HP obj=new HP();
		obj.turnOn();
		obj.turnoff();
		DELL obj1=new DELL();
		obj1.turnOn();
		obj1.turnoff();
		
	}

}
