//Multi-level--> one parent class inherit more than one child class             Father-->Son-->Grand daughter
package multi_inheritance;

public class father {
	char gender='M';
	void print() {
		System.out.println("I am parent class");
	}

}

class son extends father{
	//all this inherited from parent class
	/*char gender='M';
	void print() {
		System.out.println("I am parent class");
	}*/

}

class granddaughter extends son{
	char gender='F';	
	/*void print() {
		System.out.println("I am parent class");
	}*/
}
