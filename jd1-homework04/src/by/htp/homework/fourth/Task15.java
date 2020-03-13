package by.htp.homework.fourth;

public class Task15 {

	// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
	// элементами которого являются числа, сумма цифр которых равна К и которые не больше N.
	
	public static void main(String[] args) {
		
		int k;
		int n;
		
		k = 6;
		n = 20;		
		
		int len;
		len = arrayLength(k, n);
		
		int[] a = new int[len];
		
		arrayInit(a, k, n);
		
		printArray(a);
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
	
	public static int arrayLength(int _k, int _n) {
		int counter;
		counter = 0;
		
		for (int i = 0; i <= _n; i++) {
			if (numSum(i) == _k) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public static void arrayInit(int[] array, int _k, int _n) {
		int j;
		j = 0;
		
		for (int i = 0; i <= _n; i++) {
			if (numSum(i) == _k) {
				array[j] = i;
				j++;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
