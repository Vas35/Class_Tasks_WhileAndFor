package ua.univer.taskFor;

public class Program2 {
	public static int fact (int n) {
		int x = 1;
		for (int i=1; i<=n; i++) {
			x=x*i;
			System.out.println(x);
		}
		return x;
	}
	public static void main(String[] args) {
	
		fact(8);
	}

}
