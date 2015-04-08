package grupo8.macowins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalcularPrecioFinalDeLaPrenda {
	
	Prenda saco1;
	
	@Before
	public void init()
	{
		Tasacion nacional = new Tasacion();
		nacional.setTasa(1);
		
		Prenda.setValorFijo(100);
		Prenda.setPrecioSaco(300);
		
		saco1 = Prenda.crearSaco(nacional);
	}
	
	@Test
	public void calcularPrecioFinalDeUnaPrendaImpotada()
	{
		Assert.assertEquals(400,saco1.precioFinal(),0);
	}
	

}
