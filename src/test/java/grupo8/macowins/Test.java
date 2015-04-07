package grupo8.macowins;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		
		Nacional.setTasa(1);
		Importado.setTasa(1.3);
		Nacional nacional = new Nacional();
		Importado importado = new Importado();
		
		Prenda.setValorFijo(100);
		Prenda.setPrecioCamisa(200);
		Prenda.setPrecioPantalon(250);
		Prenda.setPrecioSaco(300);
		
		Prenda saco1 = Prenda.crearSaco(nacional);
		Prenda saco2 = Prenda.crearSaco(importado);
		Prenda saco3 = Prenda.crearSaco(importado);
		
		ArrayList<Prenda> listaDeSacos = new ArrayList<Prenda>();
		listaDeSacos.add(saco1);
		listaDeSacos.add(saco2);
		listaDeSacos.add(saco3);
		
		Prenda camisa1 = Prenda.crearCamisa(importado);
		Prenda camisa2 = Prenda.crearCamisa(nacional);

		ArrayList<Prenda> listaDeCamisas = new ArrayList<Prenda>();
		listaDeCamisas.add(camisa1);
		listaDeCamisas.add(camisa2);
		
		Venta venta1 = new Venta(listaDeSacos, 06042015);
		Venta venta2 = new Venta(listaDeCamisas, 06042015);
		
		ArrayList<Venta> listaDeVentas = new ArrayList<Venta>();
		listaDeVentas.add(venta1);
		listaDeVentas.add(venta2);
		
		Macowins unLocal = new Macowins(listaDeVentas);
		
		System.out.println(unLocal.gananciaDelDia(06042015));
		
		return;
		
	}
}
