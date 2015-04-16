package grupo8.macowins;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Local {
	
	private List<Venta> ventas;
	
	//Esto es el constructor.
	public Local(List<Venta> listaDeVentas) {
		ventas = listaDeVentas;
	}
	
	public void agregarVenta (Venta unaVenta) {
		ventas.add(unaVenta);
	}
	
	public double gananciaDelDia(int año, int mes, int dia) {
		
		return ventasDeLaFecha(año,mes,dia).stream().map(Venta::ganancia).reduce((venta1,venta2)-> venta1 + venta2);
		
	}
	

	public List<Venta> ventasDeLaFecha(int año, int mes, int dia)
	{
		LocalDate fecha = LocalDate.of(año, mes, dia);
		return (List<Venta>) ventas.stream().filter(venta -> venta.esDeLaFecha(fecha));
	}
}