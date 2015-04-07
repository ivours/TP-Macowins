package grupo8.macowins;

import java.util.ArrayList;

public class Macowins {
	
	private ArrayList<Venta> ventas;
	
	//Esto es el constructor.
	public Macowins(ArrayList<Venta> listaDeVentas) {
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