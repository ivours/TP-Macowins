package grupo8.TPMacowins;

public class Sombrero extends Prenda {
	private int coeficienteDeMetrosexualidad;
	
	public Sombrero(double tasa, Marca marca, int coeficiente){
		super(tasa, marca);
		coeficienteDeMetrosexualidad = coeficiente;
	}
	
	public int precioBase(){
		return 150 + coeficienteDeMetrosexualidad;
	}

}