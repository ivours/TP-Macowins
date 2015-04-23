package grupo8.macowins;

public class Pantalon extends Prenda{
	
	private int centimetrosCuadrados;
	
	public Pantalon(boolean esImportado, Marca marca, int centimetros) {
		super(esImportado, marca);
		centimetrosCuadrados = centimetros;
	}
	
	public int valorFijo()
	{
		return 250;
	}
	
	public int precioBase() {
		return (this.valorFijo() + centimetrosCuadrados);
	}

}