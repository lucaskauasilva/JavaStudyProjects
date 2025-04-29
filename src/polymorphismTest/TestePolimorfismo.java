package polymorphismTest;

import abstractGeometry.Geom2D;
import geometry2D.Retangulo;
import geometry2D.Triangulo;

public class TestePolimorfismo {
	
    public static void main(String[] args) {
    	
        Geom2D objRetangulo = new Retangulo(4, 2);
        objRetangulo.calcPerimetro();
        
        Geom2D objTriangulo = new Triangulo(20);
        objTriangulo.calcPerimetro();

        Geom2D maiorPeri = maiorPerimetro(objRetangulo, objTriangulo);
        System.out.println("--> Figura Geométrica maior: \n");
        if (maiorPeri instanceof Retangulo){
            Retangulo maior = (Retangulo)maiorPeri;
            System.out.println(maior);
        } else if (maiorPeri instanceof Triangulo){
            Triangulo maior = (Triangulo)maiorPeri;
            System.out.println(maior);
        }
    }
    
    /**
     * Compara duas figuras geométricas e retorna aquela com o maior perímetro.
     *
     * @param geom1 Primeira figura geométrica (exemplo: Retângulo).
     * @param geom2 Segunda figura geométrica (exemplo: Triângulo).
     * @return A figura geométrica com maior perímetro, calculado via `calcPerimetro()`.
     * @see abstractGeometry.Geom2D
     * @see geometry2D.Retangulo
     * @see geometry2D.Triangulo
     * @since 1.0
     * @version 1.0
     * @author Lucas Kauã Silva
     */
    public static Geom2D maiorPerimetro(Geom2D geom1, Geom2D geom2){
        if (geom1.getPerimetro() > geom2.getPerimetro()) {
            return geom1; 
        } else {
            return geom2;
        }
    }
}
