package multiple_inheritance;

interface father{
	abstract void call();
	abstract void talk();	
}
interface mother{
	abstract void call();
	abstract void talk();
}

class son implements father,mother {
	public void call() {
		System.out.println("Calling");
	}
	public void talk() {
		System.out.println("Talking");
	}

}
