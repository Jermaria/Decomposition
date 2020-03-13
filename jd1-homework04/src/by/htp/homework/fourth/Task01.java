package by.htp.homework.fourth;

public class Task01 {

	public static void main(String[] args) {

		// Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
		
		Coordinate a = new Coordinate();
		Coordinate b = new Coordinate();
		Coordinate c = new Coordinate();
				
		a.x = 3;
		a.y = 3;
			
		b.x = -2;
		b.y = 2;
				
		c.x = 3;
		c.y = -2;
				
		double ab, bc, ac;
				
		ab = distance(a, b);
		bc = distance(b, c);
		ac = distance(a, c);
		
		double half;
		double s;
		
		half = halfP(ab, bc, ac);		
		s = sTriangle(half, ab, bc, ac);
				
		System.out.println(s);
	}
	
	public static double distance(Coordinate _a, Coordinate _b) {
		double d;
		double temp;
		
		temp = Math.pow(_a.x - _b.x, 2) + Math.pow(_a.y - _b.y, 2);
		d = Math.sqrt(temp);
		
		return d;
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
