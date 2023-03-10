package ApplicationOO;

public class Triangle {
	
	private double a;
	private double b;
	private double c;
	private double area = 0.0;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}
	
	public void setC(double c) {
		this.c = c;
	}

	public double getArea() {	
		if(area == 0) {
			this.CalcularArea();
		}
		return area;
	}

	public void CalcularArea() {
		double p = (this.a + this.b + this.c) / 2.0;
		this.area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));		
	}
		

}
