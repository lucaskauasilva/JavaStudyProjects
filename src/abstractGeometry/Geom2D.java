package abstractGeometry;

public abstract class Geom2D { 
	protected double perimetro;
	protected double area;
  
	//métodos abstratos calcPerimetro() e calcArea()
	public abstract double calcPerimetro(); 
	public abstract double calcArea();
  
	public double getPerimetro() {
		return perimetro;
	}
	public double getArea() {
		return area;
	}
}
