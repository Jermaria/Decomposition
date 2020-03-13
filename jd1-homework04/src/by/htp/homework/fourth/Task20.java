package by.htp.homework.fourth;

public class Task20 {

	// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
	// Сколько таких действий надо произвести, чтобы получился нуль? 
	// Для решения задачи использовать декомпозицию.
	
	public static void main(String[] args) {

		int n;
		n = 1111;

		int subtractionTimes;
		subtractionTimes = countSubtraction(n);
		
		System.out.println(subtractionTimes);
	}

	public static int numSum(int x) {
		int sum;
		int temp;
		
		sum = 0;
		
		while (x > 0) {
			temp = x % 10;
			sum = sum + temp;
			x = x / 10;
		}
		return sum;
	}
	
	public static int countSubtraction(int x) {
		int counter;
		counter = 0;
		
		while (x > 0) {
			x = x - numSum(x);
			counter++;
		}
		
		return counter;
	}
}
