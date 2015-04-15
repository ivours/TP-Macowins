package grupo8.macowins;

public class Sarkany implements Marca {
	
	public double recargo(int precioBase) {
		if (precioBase > 500) 
			return (precioBase * 1.35);
		else return (precioBase * 1.1);
	}

}