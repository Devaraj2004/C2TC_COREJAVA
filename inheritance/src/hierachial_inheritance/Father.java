package hierachial_inheritance;

public class Father {
	//hierarchial inheritance--> One parent class having two child class              father-->son-->daughter    ---->at the same level
		char gender='M';
		public static void print() {
			System.out.println("I a parent class");
		}
	}

	class son extends Father{
		
	}

	class daughter extends Father{
		char gender='F';
	}
