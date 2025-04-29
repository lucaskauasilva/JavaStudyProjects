package inheritanceTest;

import geometry2D.Retangulo;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		Retangulo retan1 = new Retangulo(4, 25);
		Retangulo retan2 = new Retangulo(4, 26);
		System.out.println("1° " + retan1); //invoca método toString
		System.out.println("2° " + retan2); //invoca método toString
		
		if (retan1.equals(retan2)) { //invoca método equals
			System.out.println("São Figuras Geométricas Iguais");
		} else {
			System.out.println("São Figuras Geométricas Diferentes");
		}
	}
	
}
