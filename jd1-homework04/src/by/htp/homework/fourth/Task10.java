package by.htp.homework.fourth;

public class Task10 {

	//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
	
	public static void main(String[] args) {
		
		int sum;
		sum = 0;
		
		for (int i = 1; i < 10; i = i + 2) {
			sum = sum + factorial(i);
		}
	}
	
	public static int factorial(int a) {
		
		int f;
		f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;
		}
		return f;
	}

}
