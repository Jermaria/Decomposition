package by.htp.homework.fourth;

public class Task11 {
	// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
	// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
	// массива с номерами от k до m.
	
	public static void main(String[] args) {
		
		int[] d = new int[] {0, 1, 2, 3, 4, 5, 6};
		
		int sum1, sum2, sum3;
		
		sum1 = sum(d, 1, 3);
		sum2 = sum(d, 3, 5);
		sum3 = sum(d, 4, 6);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
	
	public static int sum(int[] array, int k, int m) {
		
		int sum;
		sum = 0;
		
		for (int i = k; i <= m; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
