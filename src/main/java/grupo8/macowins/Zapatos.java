package grupo8.TPMacowins;

public class Zapatos extends Prenda {
	private int talle;
	
	public Zapatos(double tasa, Marca marca, int unTalle){
		super(tasa, marca);
		talle = unTalle;
	}
	
	public int precioBase() {
		return 400 + (5*talle);
	}

}