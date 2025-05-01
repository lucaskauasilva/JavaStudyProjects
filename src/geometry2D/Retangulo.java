package geometry2D;

import baseGeometry.Geom2D;

public class Retangulo extends Geom2D{
	double base;
	double altura;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double calcPerimetro() {
		super.perimetro = 2 * this.base + 2 * this.altura;
		return super.perimetro;
	}
	@Override
	public double calcArea() {
		super.area = this.base * this.altura;
		return super.area;
	}
	@Override
	public String toString() {
		return String.format("Retângulo {\n"
				           + "  Perímetro = %.2f\n"
				           + "  Área: %.2f\n"
				           + "}\n",  
		this.calcPerimetro(), this.calcArea());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Retangulo) {
			Retangulo r = (Retangulo)obj;
			return (base == r.base) && (altura == r.altura);
		}else {
			return false;
		}
	}
}
