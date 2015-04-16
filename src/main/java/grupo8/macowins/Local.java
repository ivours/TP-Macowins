package grupo8.macowins;

import java.util.List;
import java.util.Optional;

public class Local {
	
	private List<Venta> ventas;
	
	//Esto es el constructor.
	public Local(List<Venta> listaDeVentas) {
		ventas = listaDeVentas;
	}
	
	public double gananciaDelDia(int unaFecha) {
		
		return ventasDeLaFecha(unaFecha).stream().map(Venta::ganancia).reduce((venta1,venta2)-> venta1 + venta2);
		
	}
	

	public List<Venta> ventasDeLaFecha(int unaFecha)
	{
		return (List<Venta>) ventas.stream().filter(venta -> venta.esDeLaFecha(unaFecha));
	}
}