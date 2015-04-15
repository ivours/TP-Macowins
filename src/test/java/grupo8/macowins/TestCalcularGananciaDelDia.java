package grupo8.macowins;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalcularGananciaDelDia {
	
	Tasacion nacional;
	Tasacion importado;
	Prenda saco1;
	Prenda saco2;
	Prenda saco3;
	ArrayList<Prenda> listaDeSacos;
	Prenda camisa1;
	Prenda camisa2;
	ArrayList<Prenda> listaDeCamisas;
	Venta venta1;
	Venta venta2;
	ArrayList<Venta> listaDeVentas;
	Local unLocal;
	
	@Before
	public void init()
	{
		nacional.setTasa(1);
		importado.setTasa(2);
		
		Prenda.setValorFijo(100);
		Prenda.setPrecioCamisa(200);
		Prenda.setPrecioPantalon(250);
		Prenda.setPrecioSaco(300);
		
		saco1 = Prenda.crearSaco(nacional);
		saco2 = Prenda.crearSaco(importado);
		saco3 = Prenda.crearSaco(importado);
		
		listaDeSacos = new ArrayList<Prenda>();
		listaDeSacos.add(saco1);
		listaDeSacos.add(saco2);
		listaDeSacos.add(saco3);
		
		camisa1 = Prenda.crearCamisa(importado);
		camisa2 = Prenda.crearCamisa(nacional);
		
		listaDeCamisas = new ArrayList<Prenda>();
		listaDeCamisas.add(camisa1);
		listaDeCamisas.add(camisa2);
		
		venta1 = new Venta(listaDeSacos, 06042015);
		venta2 = new Venta(listaDeCamisas, 06042015);
		
		listaDeVentas = new ArrayList<Venta>();
		listaDeVentas.add(venta1);
		listaDeVentas.add(venta2);
		
		unLocal = new Macowins(listaDeVentas);
	}
	
	@Test
	public void calcularGananciaDelDia()
	{
		Assert.assertEquals(2900,unLocal.gananciaDelDia(06042015),0);
	}

}
