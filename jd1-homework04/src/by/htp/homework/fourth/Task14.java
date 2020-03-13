package by.htp.homework.fourth;

public class Task14 {

	// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
	
	public static void main(String[] args) {
	
		int a = 6753;
		int b = 34943;
		
		isLonger(length(a), length(b));
	}
	
	public static int length(int x) {
		int counter;
		counter = 0;
		
		while(x > 0) {
			counter++;
			x = x / 10;
		}
		return counter;
	}
	
	public static void isLonger(int x, int y) {
		if (x > y) {
			System.out.println("первое число длиннее");
		} else if (y > x) {
			System.out.println("второе число длиннее");
		} else {
			System.out.println("числа одинаковой длины");
		}
		
	}
}
