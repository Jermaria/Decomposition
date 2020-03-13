package by.htp.homework.fourth;

public class Task12 {

	// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
	// если угол между сторонами длиной X и Y— прямой.
	
	public static void main(String[] args) {
		
		double x, y, z, t;
		
		x = 12;
		y = 10;
		z = 16;
		t = 8;
		
		double diagonal;
		diagonal = findDiagonal(x, y);
		
		double p1, p2, s1, s2;
		
		p1 = halfP(x, y, diagonal);
		p2 = halfP(z, t, diagonal);
		
		s1 = sTriangle(p1, x, y, diagonal);
		s2 = sTriangle(p2, z, t, diagonal);
		
		double s;
		
		s = s1 + s2;
		
		System.out.println(s);

	}

	public static double findDiagonal(double a, double b) {
		double c;
		c = Math.sqrt(a * a + b * b);
		return c;
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
