package by.htp.homework.fourth;

public class Task06 {

	// Вычислить площадь правильного шестиугольника со стороной а, 
	// используя метод вычисления площади треугольника.
	
	public static void main(String[] args) {
		
		double a;
		double s;
		double halfPerim;
		a = 6;
		
		halfPerim = halfP(a, a, a); // методы взяты из 1 таски
		s = 6 * sTriangle(halfPerim, a, a, a);
		
		System.out.println(s);
	}
	
	public static double halfP(double _a, double _b, double _c) {
		double p, half;
		
		p = _a + _b + _c;
		half = p / 2;
		
		return half;
	}
	
	public static double sTriangle(double _half, double _a, double _b, double _c) {
		double temp;
		double s;
		
		temp = _half * (_half - _a) * (_half - _b) * (_half - _c);
		s = Math.sqrt(temp);
		
		return s;
	}

}
