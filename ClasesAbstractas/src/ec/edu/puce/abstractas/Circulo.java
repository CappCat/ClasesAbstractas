package ec.edu.puce.abstractas;

public class Circulo extends FiguraGeometrica{
	
	public Circulo(String nombre) {
		super(nombre);
	}

	private double radio;

	@Override
	public double calcularArea() {
		
		return this.radio*3.14*2;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
