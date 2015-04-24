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
	
	public double gananciaDelDia(String dia) {
		LocalDate fecha = LocalDate.parse(dia);
		return ventasDeLaFecha(fecha).stream().map(Venta::ganancia).reduce((venta1,venta2)-> venta1 + venta2).get();
		
	}
	
	public List<Venta> ventasDeLaFecha(LocalDate fecha){
		return ventas.stream().filter(venta -> venta.esDeLaFecha(fecha)).collect(Collectors.toList());
	}
}