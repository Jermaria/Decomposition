package by.htp.homework.fourth;

public class Task07 {
	
	// На плоскости заданы своими координатами n точек. 
	// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
	// Указание. Координаты точек занести в массив.
	
	public static void main(String[] args) {
	
		double[] x = new double[] {4, -2, -3, 1};
		double[] y = new double[] {4, -2, 2, -1};
		
		int length;
		
		length = arrayLength(x, y);
		
		double[] distance = new double[length];
		
		arrayInit(distance, x, y);
		
		showCoordinates(distance, x, y);	
	}
	
	public static int arrayLength(double[] a, double[] b) {
		int counter;
		counter = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j <b.length; j++) {
				counter++;
			}
		}
		return counter;
	}
	
	public static double dist(double x1, double x2, double y1, double y2) {
		double d;
		double temp;
		
		temp = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		d = Math.sqrt(temp);
		
		return d;
	}
	
	public static void arrayInit(double[] _distance, double[] a, double[] b) {
		int index;
		index = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j <b.length; j++) {
				_distance[index] = dist(a[i], a[j], b[i], b[j]);
				index++;
			}
		}
	}
	
	public static double findIndexOfMax(double[] array) {
		double max;
		int indexOfMax;

		max = array[0];
		IndexOfMax = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				indexOfMax = i;
			}
		}
		return indexOfMax;
	}
	
	public static void showCoordinates(double[] array, double[] a, double[] b) {
		
		int index;
		index = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j <b.length; j++) {
				if (index == findIndexOfMax(array) ) {
					System.out.println("between coordinates (" + a[i] + ";" + b[i] + ") and (" + a[j] + ";" + b[j] + ")");
				}
				index++;	
			}
		}
	}
}
