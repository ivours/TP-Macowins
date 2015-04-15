package grupo8.TPMacowins;

public class Saco extends Prenda {
	
	private int numeroDeBotones;
	
	public Saco(double tasa, Marca marca, int botones){
		super(tasa, marca);
		numeroDeBotones = botones;
	}
	
	public int precioBase() {
		return 300 + (numeroDeBotones*10);
	}

}