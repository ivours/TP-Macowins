package grupo8.macowins;

public class Sombrero extends Prenda {
	private int coeficienteDeMetrosexualidad;
	
	public Sombrero(boolean esImportado, Marca marca, int coeficiente){
		super(esImportado, marca);
		coeficienteDeMetrosexualidad = coeficiente;
	}
	
	public int valorFijo()
	{
		return 150;
	}
	
	public int precioBase(){
		return this.valorFijo() + coeficienteDeMetrosexualidad;
	}

}