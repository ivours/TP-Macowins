package grupo8.macowins;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Venta {
	
	private LocalDate fecha;
	
	private List<Prenda> prendas;
	
	
	
	public LocalDate fecha()
	{
		return fecha;
	}
	
	public double ganancia()
	{	
		return prendas.stream().map(Prenda::precioFinal).reduce((prenda1,prenda2) -> prenda1 + prenda2);
	}
	
	public boolean esDeLaFecha(LocalDate otraFecha)
	{
		return fecha.isEqual(otraFecha);
	}
	
	public int cantidad() {
		return prendas.size();
	}
	//Constructor.
	public Venta(List<Prenda> listaDePrendas, int año, int mes, int dia) {
		
		fecha = LocalDate.of(año,mes,dia);
		prendas = listaDePrendas;
		
	}

}
