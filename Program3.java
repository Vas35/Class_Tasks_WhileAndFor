package ua.univer.taskFor;

public class Program3 {
	public static int pow (int x, int n) {
		int y =1;
		for (int i=1; i<=n; i++) {
			y=y*x;
			System.out.println(y);
		}
		return y;
	}
	public static void main(String[] args) {
	
		pow(4,4);
	}

}
