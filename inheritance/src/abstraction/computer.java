package abstraction;

abstract class computer {
	abstract void turnoff();    // there is no body part only declaration  part..
	void turnOn() {
		System.out.println("turning on");
	}
}

class HP extends computer{
	//once abstract method ha implement panitomanaa  namba mathaa class la inherit pani vachi erukom laa athula antha abstract method ha override pananum kandipa..
	void turnoff() {
		System.out.println("turning off-hp");
	}
}

class DELL extends computer{
	void turnoff() {
		System.out.println("turning off-dell");
	}
	
}
