package geometry3D;

import abstractGeometry.Geom3D;

public class Tetraedro extends Geom3D {
    private final double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcArea() {
        super.area = Math.sqrt(3) * Math.pow(this.aresta, 2);
        return super.area;
    }

    @Override
    public double calcVolume() {
        super.volume = Math.pow(this.aresta, 3) / (6 * Math.sqrt(2));
        return super.volume;
    }

    @Override
    public String toString() {
        return String.format("Tetraedro: {\n  Área: %.2f\n  Volume: %.2f\n}", this.calcArea(), this.calcVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tetraedro) {
            Tetraedro t = (Tetraedro) obj;
            return this.aresta == t.aresta;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Tetraedro tetra1 = new Tetraedro(1);
        Tetraedro tetra2 = new Tetraedro(2);

        System.out.println(tetra1);
        System.out.println(tetra2);

        if (tetra1.equals(tetra2)) {
            System.out.println("\nFiguras Geométricas Iguais");
        } else {
            System.out.println("\nFiguras Geométricas Diferentes");
        }
    }
}
