package day07;

public class Test06_Has_a {
	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println(c1);
		
		c1.setP(new Point(7, 9));
		c1.setR(3);
		
		System.out.println(c1);
		c1.setR(c1.getR()*2);
		System.out.println(c1);

	}

}


class Point{
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public Point() {
		super();
	}
	
	
}

class Circle 
{
	private Point p;  // has a 관계
	int r;
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	
	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle() {	}
	
	@Override
	public String toString() {
		return "Circle [중심점=" + p + ", 반지름=" + r + "]";
	}
	
	
}

