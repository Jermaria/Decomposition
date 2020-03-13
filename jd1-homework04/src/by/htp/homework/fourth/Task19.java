package by.htp.homework.fourth;

public class Task19 {

	// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
	// Определить также, сколько четных цифр в найденной сумме. 
	// Для решения задачи использовать декомпозицию.
	
	public static void main(String[] args) {
		
		int n;
		n = 4;
		
		int first = (int) Math.pow(10, n - 1);
		int last = (int) Math.pow(10, n);
		
		int sum;
		
		sum = sumOdd(first, last);
		System.out.println("sumOdd = " + sum);
		
		int even;
		
		even = countEven(sum);
		System.out.println("There are " + even + " even digits in the sum");	
	}

	public static boolean checkOdd(int x) {
		int temp;
		while (x > 0) {
			temp = x % 10;
			if (temp % 2 == 0) {
				return false;
			}
			x = x / 10;
		}
		return true;
	}
	
	public static int sumOdd(int _first, int _last) {
		int sum;
		sum = 0;
		
		for ( int i = _first; i < _last; i++) {
			if (checkOdd(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static int countEven(int x) {
		int temp;
		int counter;
		counter = 0;
		
		while (x > 0) {
			temp = x % 10;
			if (temp % 2 == 0) {
				counter++;
			}
			x = x / 10;
		}
		
		return counter;
	}
}

