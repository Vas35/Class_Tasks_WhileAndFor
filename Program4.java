package ua.univer.taskFor;

public class Program4 {

	public static int consist () {
		int x = 1;
		int count = 0;
		for (int i=0; i>-100; i -=5) {
			count ++;
			if (count == 11) break;
			System.out.println("количество итераций = "+ count);
			System.out.println(i);
		}
		return x;
	}
	public static void main(String[] args) {
	
		consist ();
	}

}
