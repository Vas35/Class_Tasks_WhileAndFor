package ua.univer.taskFor;

public class Program5 {

		public static void main(String[] args) {
		
		String searchMe = "Работа не волк";
		
		int max = searchMe.length();
		
		char symb = 'о';
		
		boolean find = false;
		for (int i = 0; i < max; i++) {
		
		if (searchMe.charAt(i) == symb) {
		
		find = true;
		break;
		}
		}
		
		if (find)
		System.out.println("Символ '" + symb + "' найден в строке");
		else
		System.out.println("Символ '" + symb + "' не найден в строке");
		}
	}