package ua.univer.task.While;

public class Program1 {

	public static int numbOdd() {
		int y=0;
		int i = 1;
		while (i<=99) {
			System.out.println(i);
			i++;
  			if (i%2 == 0) continue;
  			y = i;
  			
   		}
		return y;	
	
	}
    
	public static void main(String[] args) {
	numbOdd();
  			 
		
	}

}