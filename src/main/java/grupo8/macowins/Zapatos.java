package grupo8.macowins;

public class Zapatos extends Prenda {
	private int talle;
	
	public Zapatos(boolean sonImportados, Marca marca, int unTalle){
		super(sonImportados, marca);
		talle = unTalle;
	}
	
	public int valorFijo()
	{
		return 400;
	}
	
	public int precioBase() {
		return this.valorFijo() + (5*talle);
	}

}