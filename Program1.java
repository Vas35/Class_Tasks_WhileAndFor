package ua.univer.taskFor;

public class Program1 {
    
	public static int numbOdd() {
		int y=0;
		for ( int i = 1;i<=99; i++) {
  			if (i%2 == 0) continue;
  			y = i;
  			System.out.println(y);
   		}	
		return y;
	}
    
	public static void main(String[] args) {
		numbOdd();
  			 
		
	}

}
