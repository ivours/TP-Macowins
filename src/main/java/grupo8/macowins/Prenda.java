package grupo8.macowins;

public class Prenda {
	
	private static int ValorFijo;
	private static int PrecioPantalon;
	private static int PrecioCamisa;
	private static int PrecioSaco;
	private Tasacion origen;
	//Agregue precioBase para que el metodo precioFinal sea polimorfico.
	private int precioBase;
	
	
	public static void setPrecioPantalon(int unPrecio) {
		PrecioPantalon = unPrecio;
	}
	public static void setPrecioCamisa(int unPrecio) {
		PrecioCamisa = unPrecio;
	}
	public static void setPrecioSaco(int unPrecio) {
		PrecioSaco = unPrecio;
	}
	public static void setValorFijo(int unValor) {
		ValorFijo = unValor;
	}
	
	public void setPrecioBase(int unPrecio) {
		precioBase = unPrecio;
		return;
	}
	
	public void setOrigen(Tasacion unOrigen) {
		origen = unOrigen;
		return;
	}
	
	public static Prenda crearPantalon(Tasacion unOrigen) {
		Prenda unPantalon = new Prenda();
		unPantalon.setPrecioBase(PrecioPantalon);
		unPantalon.setOrigen(unOrigen);
		return unPantalon;
	}
	
	public static Prenda crearCamisa(Tasacion unOrigen) {
		Prenda unaCamisa = new Prenda();
		unaCamisa.setPrecioBase(PrecioCamisa);
		unaCamisa.setOrigen(unOrigen);
		return unaCamisa;
	}
	
	public static Prenda crearSaco(Tasacion unOrigen) {
		Prenda unSaco = new Prenda();
		unSaco.setPrecioBase(PrecioSaco);
		unSaco.setOrigen(unOrigen);
		return unSaco;
	}
	
	public double precioFinal() {
		return ((ValorFijo + precioBase) * origen.tasa());
	}
}
