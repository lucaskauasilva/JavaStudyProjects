package examples;

import geometry2D.Circulo;
import geometry2D.Retangulo;
import geometry2D.Triangulo;
import geometry3D.Cubo;
import geometry3D.Esfera;
import geometry3D.Tetraedro;

public class ExemploHeranca {
	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(3);
		Retangulo retangulo = new Retangulo(4, 25);
		Triangulo triangulo = new Triangulo(5);
		
		Cubo cubo = new Cubo(10);
		Esfera esfera = new Esfera(10);
		Tetraedro tetraedro = new Tetraedro(10);
		
		/*Invocam o método toString*/
		System.out.println(circulo);
		System.out.println(retangulo);
		System.out.println(triangulo);
		System.out.println(cubo);
		System.out.println(esfera);
		System.out.println(tetraedro);
	}
}
