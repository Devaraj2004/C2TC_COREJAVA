package polymorphism;

public class poly {
	public static void main(String[] args) {
		method m1 = new method();
		m1.disp();
		m1.disp(10);
		
	}
}
// Method overloading--> rendu method hum same ha erukum ula pass pandra argument the different huu ..signature porthu than method overloading soludrom
	class method{
		void disp() {
			System.out.println("I am displaying");
		}
		//        method signature
		void disp(int a) {
			System.out.println(a);
		}
	}

