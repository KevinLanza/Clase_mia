
public class Principal {

	public static void main(String[] args)
	{
		Triangulo t = new Triangulo(4,5);
		System.out.println(t.getArea());
		
		Circulo c = new Circulo(5);
		System.out.println(c.getArea());
		System.out.println(c.getPerimetro());

	}

}
