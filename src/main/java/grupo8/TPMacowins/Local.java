package grupo8.TPMacowins;

import java.util.ArrayList;

public class Local {
	
	private ArrayList<Venta> ventas;
	
	//Esto es el constructor.
	public Local(ArrayList<Venta> listaDeVentas) {
		ventas = listaDeVentas;
	}
	
	public double gananciaDelDia(int unafecha) {
		double gananciaTotal = 0;
		for(Venta v : ventas) {
			gananciaTotal = gananciaTotal + v.ganancia();
		}
		return gananciaTotal;
	}
}