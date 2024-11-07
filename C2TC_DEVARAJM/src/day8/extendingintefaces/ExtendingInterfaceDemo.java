package day8.extendingintefaces;
public class ExtendingInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ExtendingInterfaceDemo ei=new ExtendingInterfaceDemo();
		ei.print();
		ei.show();
	}
}
