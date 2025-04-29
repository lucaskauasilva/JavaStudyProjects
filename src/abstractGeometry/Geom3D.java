package abstractGeometry;

public abstract class Geom3D {
	protected double area;
	protected double volume;
	
	//métodos abstratos calcArea() e calcVolume()
	public abstract double calcArea();
	public abstract double calcVolume();
	
	public double getArea() {
		return area;
	}
	public double getvolume() {
		return volume;
	}
}
