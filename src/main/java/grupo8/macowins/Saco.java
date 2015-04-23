package grupo8.macowins;

public class Saco extends Prenda {
	
	private int numeroDeBotones;
	
	public Saco(boolean esImportado, Marca marca, int botones){
		super(esImportado, marca);
		numeroDeBotones = botones;
	}
	
	public int valorFijo()
	{
		return 300;
	}
	
	public int precioBase() {
		return this.valorFijo() + (numeroDeBotones*10);
	}

}