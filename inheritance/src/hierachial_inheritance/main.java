package hierachial_inheritance;

public class main {
	public static void main(String[]agrs) {
		son s=new son();
		s.print();
		System.out.println(s.gender);
		daughter d=new daughter();
		d.print();
		System.out.println(d.gender);
	}
}
