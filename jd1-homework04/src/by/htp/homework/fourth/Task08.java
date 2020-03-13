package by.htp.homework.fourth;

public class Task08 {

	// Составить программу, которая в массиве A[N] находит второе по величине число 
	// (вывести на печать число, которое меньше максимального элемента массива, 
	// но больше всех других элементов).
	
	public static void main(String[] args) {
		
		double[] arr = new double[] {6, 15, 78.6, 72};
		
		sort(arr);
		
		System.out.println(arr[1]);
	}

	public static void sort(double[] array) {
		double temp;
		
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] > array[j-1]) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
}
