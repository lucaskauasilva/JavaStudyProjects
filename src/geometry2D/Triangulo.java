package geometry2D;

import abstractGeometry.Geom2D;

public class Triangulo extends Geom2D{
	double ladoA;
	double ladoB;
	double ladoC;
	
	public Triangulo(double lado){ //Triângulo Equilátero
		this.ladoA = lado;
		this.ladoB = lado;
		this.ladoC = lado;
	}
	
	public Triangulo(double a, double b, double c){ //Triângulo Escaleno
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	public String toString(){
		return String.format("Triângulo {\n  Perímetro = %.2f\n}\n", this.calcPerimetro());
	}
	
	public double calcPerimetro() {
		super.perimetro = this.ladoA + this.ladoB + ladoC;
		return super.perimetro;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
