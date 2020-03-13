package by.htp.homework.fourth;

public class Task13 {

	// Дано натуральное число N. Написать метод(методы) для формирования массива, 
	// элементами которого являютс цифры числа N.
	
	public static void main(String[] args) {
	
		int n = 50;
		
		int len = arrayLength(n);
		
		int[] arr = new int[len];
		arrayInit(arr, n);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
	}
	
	public static int arrayLength(int _n) {
		int count;
		count = 0;
		
		while (_n > 0) {
			count = count + 1;
			_n = _n / 10;
		}
		
		return count;
	}
	
	public static void arrayInit(int[] array, int _n) {
		int j;
		j = 0;
		for (int i = 0; i < array.length; i++) {
			array[j] = _n % 10;
			j = j++;
			_n = _n / 10;
		}
	}

}
