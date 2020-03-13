package by.htp.homework.fourth;

public class Task16 {

	// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
	// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
	// Для решения задачи использовать декомпозицию.
	
	public static void main(String[] args) {
		
		int n1, n2;
		
		n1 = 3;
		n2 = 13;
		
		int amount = countSimple(n1, n2);
		
		int[] simple = new int[amount];
		simpleInit(simple, n1, n2);
		
		printTwins(simple);	
	}

	public static int countSimple(int a, int b) {
		int counter;
		counter = 0;
		
		outer:	for(int i = a; i <= b; i++) {
					for (int j = i - 1; j > 1; j--) {
						if(i % j == 0) {
							continue outer;
						} 
					}
					counter++;
				}
		return counter;
	}
	
	public static void simpleInit(int[] array, int a, int b) {
		int index;
		index = 0;
		
		outer:	for(int i = a; i <= b; i++) {
					for (int j = i - 1; j > 1; j--) {
						if(i % j == 0) {
							continue outer;
						} 
					}
					array[index] = i;
					index++;
				}
	}
	
	public static void printTwins(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] + 2 == array[i + 1]) {
				System.out.println(array[i] + " и " + array[i + 1]);
			}
		}
	}
}
