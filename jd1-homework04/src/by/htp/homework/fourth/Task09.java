package by.htp.homework.fourth;

public class Task09 {

	// // Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
	
	public static void main(String[] args) {
	
		int[] arr = new int[] {24, 25, 29};
		
		int nod;
		
		nod = nodForMany(arr);
		checkSimple(nod);
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
	
	public static void checkSimple(int a) {
		
		if (a == 1) {
			System.out.println("числа взаимно простые");
		} else {
			System.out.println("числа не взаимно простые");
		}
	}

}
