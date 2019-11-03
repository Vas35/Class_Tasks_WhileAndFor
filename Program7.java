package ua.univer.task.While;

public class Program2 {

	public static int fact (int n) {
		int x = 1;
		int i=1;
		while ( i<=n) {
			System.out.println(x);
			i++;
			x *=i;
			
		}
		return x;
	}
	public static void main(String[] args) {
	
		fact(8);
	}

}