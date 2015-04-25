package grupo8.macowins;

import java.time.LocalDate;
import java.util.List;

public class Venta {
	
	private LocalDate fecha;
	
	private List<Prenda> prendas;
	
	
	
	public LocalDate fecha()
	{
		return fecha;
	}
	
	public double ganancia()
	{	
		return prendas.stream().map(Prenda::precioFinal).reduce((prenda1,prenda2) -> prenda1 + prenda2).get();
	}
	
	public boolean esDeLaFecha(LocalDate otraFecha)
	{
		return fecha.isEqual(otraFecha);
	}
	
	public int cantidad() {
		return prendas.size();
	}
	//Constructor.
	public Venta(List<Prenda> listaDePrendas, LocalDate dia) {
		
		fecha = dia;
		prendas = listaDePrendas;
		
	}

}
