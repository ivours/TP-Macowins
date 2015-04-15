package grupo8.TPMacowins;

import java.util.ArrayList;

public class Venta {
	
	private int fecha;
	
	private ArrayList<Prenda> prendas;
	
	
	public int fecha()
	{
		return fecha;
	}
	
	public double ganancia()
	{
		double gananciaTotal = 0;
		
		for(Prenda p : prendas) {
			gananciaTotal = gananciaTotal + p.precioFinal();
		}
		
		return gananciaTotal;
	}
	
	public int cantidad() {
		return prendas.size();
	}
	//Constructor.
	public Venta(ArrayList<Prenda> listaDePrendas, int unaFecha) {
		
		fecha = unaFecha;
		prendas = listaDePrendas;
		
	}

}
