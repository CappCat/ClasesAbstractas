package ec.edu.puce.abstractas;

public class Main {
	public static void main(String [] args) {
		Rectangulo r1 = new Rectangulo("");
		r1.setBase(6);
		r1.setAltura(15);	
		r1.setNombre("Rectangulo 1");
		System.out.println(r1.toString());
		
		Rectangulo r2 = new Rectangulo("");
		r2.setBase(80);
		r2.setAltura(10);	
		r2.setNombre("Rectangulo 2");
		System.out.println(r2.toString());
		
		if (r1.mayorQue(r2)) {
			System.out.println("El Mayor es:  "+ r1.toString());	
		}
		else {
			System.out.println("El mayor es: "+ r2.toString());
		}
		
		Circulo circulo = new Circulo("");
		circulo.setRadio(8);
		circulo.setNombre("Círculo 1");
		System.out.println(circulo.toString());
		
		Triangulo triangulo = new Triangulo("");
		triangulo.setBase(7);
		triangulo.setAltura(8);
		triangulo.setNombre("Triangulo 1");
		System.out.println(triangulo.toString());
		
		if (circulo.mayorQue(triangulo)) {
			System.out.println("El Mayor es:  "+ circulo.toString());	
		}
		else {
			System.out.println("El mayor es: "+ triangulo.toString());
		}
		
		
		
	}

}