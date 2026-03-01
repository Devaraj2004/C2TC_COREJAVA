package polymorphism;
//parent class/base class/super class
public class poly1 {
	int  legs=4;
public static void walk() 
{
	System.out.println("I am walking");
}
public static void eat() 
{
	System.out.println("I am eating");
}
}
//child class/sub class
class dog extends poly1{
	//int leg=5;
	// method overriding->> parent class la same method erukum and child class hum same method name erukum but and implemention matum veraa .
	public static void eat() {
		System.out.println("I am dog ");
	}
	
}


