package grupo8.macowins;

public class Importado implements Tasacion {
	
	private static double Tasa;
	
	
	public double tasa() {
		return Tasa;
	}
	
	public static void setTasa(double nuevaTasa) {
		Tasa = nuevaTasa;
		return;
	}

}
