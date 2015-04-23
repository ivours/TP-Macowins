package grupo8.macowins;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Local {
	
	private List<Venta> ventas;
	
	//Esto es el constructor.
	public Local(List<Venta> listaDeVentas) {
		ventas = listaDeVentas;
	}
	
	public void agregarVenta (Venta unaVenta) {
		ventas.add(unaVenta);
	}
	
	public double gananciaDelDia(int anio, int mes, int dia) {
		
		return ventasDeLaFecha(anio,mes,dia).stream().map(Venta::ganancia).reduce((venta1,venta2)-> venta1 + venta2).get();
		
	}
	
	public List<Venta> ventasDeLaFecha(int anio, int mes, int dia)
	{
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		return ventas.stream().filter(venta -> venta.esDeLaFecha(fecha)).collect(Collectors.toList());
	}
}