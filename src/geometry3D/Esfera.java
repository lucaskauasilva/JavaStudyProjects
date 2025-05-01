package geometry3D;

import baseGeometry.Geom3D;

public class Esfera extends Geom3D {
    private final double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        super.area = 4 * Math.PI * Math.pow(this.raio, 2);
        return super.area;
    }

    @Override
    public double calcVolume() {
        super.volume = (4.0 / 3.0) * Math.PI * Math.pow(this.raio, 3);
        return super.volume;
    }

    @Override
    public String toString() {
        return String.format("Esfera: {\n  Área: %.2f\n  Volume: %.2f\n}\n", this.calcArea(), this.calcVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Esfera) {
            Esfera e = (Esfera) obj;
            return this.raio == e.raio;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Esfera esfera1 = new Esfera(1);
        Esfera esfera2 = new Esfera(2);

        System.out.println(esfera1);
        System.out.println(esfera2);

        if (esfera1.equals(esfera2)) {
            System.out.println("\nFiguras Geométricas Iguais");
        } else {
            System.out.println("\nFiguras Geométricas Diferentes");
        }
    }
}
