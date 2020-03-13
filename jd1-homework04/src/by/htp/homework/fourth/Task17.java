package by.htp.homework.fourth;

public class Task17 {
	
	// Натуральное число, в записи которого n цифр, называется числом Армстронга, 
	// если сумма его цифр, возведеннЫХ в степень n, равна самому числу. 
	// Найти все числа Армстронга от 1 до k. 
	// Для решения задачи использовать декомпозицию.

	public static void main(String[] args) {
		
		int k;
		k = 1000;
		
		armstrong(k);
	}

	public static int numLength(int x) {
		int counter;
		counter = 0;
		
		while (x > 0) {
			counter++;
			x = x / 10;
		}
		
		return counter;
	}
	
	public static double numSumPow(int x) {
		int pow;
		double sum;
		int temp;
		
		pow = numLength(x);
		sum = 0;
		
		while (x > 0) {
			temp = x % 10;
			sum = sum + Math.pow(temp, pow);
			x = x / 10;
		}
		return sum;
	}
	
	public static void armstrong(int limit) {
		for (int i = 1; i < limit; i++) {
			if (i == numSumPow(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
