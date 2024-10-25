package day2;

public class continueprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i= 5; i< 15; i++) 
		  { 
		  // Odd numbers are skipped 
		  if (i%2 == 0) 
		  continue; 
		  // Even numbers are printed 
		  System.out.print(i + " "); 
		  }
	}

}
