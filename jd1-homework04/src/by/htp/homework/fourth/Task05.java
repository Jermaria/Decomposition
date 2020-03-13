package by.htp.homework.fourth;

public class Task05 {

	// Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел
	
	public static void main(String[] args) {
		
		double[] arr = new double[] {78, 45, 90.5};
		
		double max, min;
		
		max = findMax(arr);
		min = findMin(arr);
		
		double sum;
		
		sum = max + min;
		
		System.out.println(sum);
	}
	
	public static double findMax(double[] array) {
		double max;

		max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static double findMin(double[] array) {
		double min;

		min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
