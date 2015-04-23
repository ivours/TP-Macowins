package grupo8.macowins;

abstract class Prenda {
	
	private static int valorFijo;
	private boolean esImportada;
	private Marca marca;
	
	public abstract int precioBase();
	
	public Prenda(boolean esPrendaImportada, Marca unaMarca){
		esImportada = esPrendaImportada;
		marca = unaMarca;
	}
	
	public static void setValorFijo(int unValor) {
		valorFijo = unValor;
	}
	public double precioFinal() {
		return ((valorFijo + this.precioBase()) * tasaImportacion()) * marca.recargo(this.precioBase());
	}
	
	public double tasaImportacion() {
		return this.esImportada ? 1.3 : 1; 
	}
}
