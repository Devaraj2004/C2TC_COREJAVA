package Interface;

interface father{
	// interface ula eruka yelaamae abstract ha than erukanum
	abstract void call();
	abstract void talk();
}
class Interface implements father {
	//enga public access modifier use paanum en na interface la oru call() and talk() method eruku and 
	//class la oru call() and talk() method eruku so athu crash agum atha nala than public use pananum..
	public void call() {
		System.out.println("Calling");
	}
	public void talk() {
		System.out.println("Talking");
	}
	
	

}
