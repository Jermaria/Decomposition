package by.htp.homework.fourth;

public class Task04 {
	
	// Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.

	public static void main(String[] args) {
		
		int[] arr3 = new int[] {5, 15, 60};
		int nok;
		
		nok = nokForMany(arr3);
		System.out.println("НОК = " + nok);
	}
	
	public static int nokForMany(int[] array) {
		int nok;
		nok = nok(array[0], array[1]);
		
		for (int i = 2; i < array.length; i++) {
			nok = nok(nok, array[i]);
		}
		
		return nok;
	}
	
	public static int nok(int _a, int _b) {
		int nok;
		
		nok = _a * _b / nod(_a, _b);
		
		return nok;
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
