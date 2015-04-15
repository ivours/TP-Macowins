package grupo8.TPMacowins;

public class Pantalon extends Prenda{
	
	private int centimetrosCuadrados;
	
	public Pantalon(double tasa, Marca marca, int centimetros) {
		super(tasa, marca);
		centimetrosCuadrados = centimetros;
	}
	
	public int precioBase() {
		return (250 + centimetrosCuadrados);
	}

}