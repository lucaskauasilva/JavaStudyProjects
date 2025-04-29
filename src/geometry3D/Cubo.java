package geometry3D;

import abstractGeometry.Geom3D;

public class Cubo extends Geom3D{
	private final double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcArea() {
		super.area = 6 * this.lado * this.lado;
		return super.area;
	}
	
	@Override
	public double calcVolume() {
		super.volume = this.lado * this.lado * this.lado;
		return super.volume;
	}
	
	@Override
	public String toString() {
		return String.format("Cubo: {\n  Área: %.2f\n  Volume: %.2f\n}", this.calcArea(), this.calcVolume());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cubo) {
			Cubo c = (Cubo)obj;
			return this.lado == c.lado;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Cubo cubo1 = new Cubo(1);
		Cubo cubo2 = new Cubo(2);
		
		System.out.println(cubo1);
		System.out.println(cubo2);
		
		if (cubo1.equals(cubo2)) {
			System.out.println("\nFiguras Geométricas Iguais");
		} else {
			System.out.println("\nFiguras Geométricas Diferentes");
		}
	}
}