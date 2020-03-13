package by.htp.homework.fourth;

public class Task18 {

	// Найти все натуральные n-значные числа, цифры в которых образуют 
	// строго возрастающую последовательность (например, 1234, 5789). 
	// Для решения задачи использовать декомпозицию.
	
	public static void main(String[] args) {
	
		int n;
		n = 4;
		
		int first = (int) Math.pow(10, n - 1);
		int last = (int) Math.pow(10, n);
		
		findIncreasing(first, last);
	}
	
	public static boolean checkIncreasing(int x) {
		int previous, current;
		previous = 10;
		
		while (x > 0) {
			current = x % 10;
			if (current >= previous) {
				return false;
			}
			previous = current;
			x = x / 10;
		}
		return true;
	}
	
	public static void findIncreasing(int _first, int _last) {
		for (int i = _first; i  < _last; i++) {
			if (checkIncreasing(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
