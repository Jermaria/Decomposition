package by.htp.homework.fourth;

public class Task02 {

	public static void main(String[] args) {
		
		// Написать метод(методы) для нахождения наибольшего общего делителя 
		// и наименьшего общего кратного двух натуральных чисел
		
		int a, b;
		a = 10;
		b = 15;
		
		int nod, nok;
				
		nod = nod(a, b);
		System.out.println("НОД = " + nod);
		
		nok = nok(a, b);
		System.out.println("НОК = " + nok);
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

	public static int nok(int _a, int _b) {
		int nok;
		
		nok = _a * _b / nod(_a, _b);
		
		return nok;
	}
}
