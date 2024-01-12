package ec.edu.puce.abstractas;

public class Rectangulo extends FiguraGeometrica{
	
	public Rectangulo(String nombre) {
		super(nombre);
	}

	private double base;
	private double altura;

	@Override
	public double calcularArea() {
		
		return this.base * this.altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	

}