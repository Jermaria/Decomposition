package by.htp.homework.fourth;

public class Task03 {

	public static void main(String[] args) {

		// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
		
		int[] arr4 = new int[] {30, 40, 55, 60};
		int nod; 
				
		nod = nodForMany(arr4);
		System.out.println("НОД = " + nod);
	}
	
	public static int nodForMany(int[] array) {
		
		int nod;
		nod = nod(array[0], array[1]);
		
		for (int i = 2; i < array.length; i++) {
			nod = nod(nod, array[i]);
		}
		return nod;	
	}
	
	public static int nod(int _a, int _b) {
		
		int min, max;
		min = Math.min(_a, _b);
		max = Math.max(_a, _b);

		int nod = 1;
		
		for (int i = min; i > 0; i--) {
			if ((min % i == 0) && (max % i == 0)) {
				nod = i;
				break;
			}
		}
		return nod;
	}
}
