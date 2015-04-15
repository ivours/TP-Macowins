package grupo8.macowins;

abstract class Prenda {
	
	private static int valorFijo;
	private double tasaImportacion;
	private Marca marca;
	
	public abstract int precioBase();
	
	public Prenda(double tasa, Marca unaMarca){
		tasaImportacion = tasa;
		marca = unaMarca;
	}
	
	public static void setValorFijo(int unValor) {
		valorFijo = unValor;
	}
	public double precioFinal() {
		return ((valorFijo + this.precioBase()) * tasaImportacion + marca.recargo(this.precioBase()));
	}
}
