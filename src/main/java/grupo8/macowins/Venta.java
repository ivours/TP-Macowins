package grupo8.macowins;

import java.util.List;
import java.util.Optional;

public class Venta {
	
	private int fecha;
	
	private List<Prenda> prendas;
	
	
	public int fecha()
	{
		return fecha;
	}
	
	public double ganancia()
	{	
		return prendas.stream().map(Prenda::precioFinal).reduce((prenda1,prenda2) -> prenda1 + prenda2);
	}
	
	public boolean esDeLaFecha(int unaFecha)
	{
		return (this.fecha() == unaFecha);
	}
	
	public int cantidad() {
		return prendas.size();
	}
	//Constructor.
	public Venta(List<Prenda> listaDePrendas, int unaFecha) {
		
		fecha = unaFecha;
		prendas = listaDePrendas;
		
	}

}
