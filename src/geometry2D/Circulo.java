package geometry2D;

import baseGeometry.Geom2D;

public class Circulo extends Geom2D {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        super.area = Math.PI * Math.pow(this.raio, 2);
        return super.area;
    }

    @Override
    public String toString() {
        return String.format("Círculo {\n  Área = %.2f\n}\n", this.calcArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circulo) {
            Circulo c = (Circulo) obj;
            return this.raio == c.raio;
        } else {
            return false;
        }
    }

	@Override
	public double calcPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
