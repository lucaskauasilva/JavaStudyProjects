package examples;

import geometry2D.Retangulo;

public class ExemploEquals {
	
	public static void main(String[] args) {
		
		Retangulo retangulo1 = new Retangulo(4, 25);
		Retangulo retangulo2 = new Retangulo(4, 24);
		
		System.out.println("1º" + retangulo1);
		System.out.println("2º" + retangulo2);
		
		if (retangulo1.equals(retangulo2)) {
			System.out.println("Note: são figuras geométricas de proporções iguais");
		} else {
			System.out.println("Note: são figuras geométricas de proporções diferentes");
		}
		
	}
	
}
