import prueba.Padre;

class MiClase
{
	static int estatica;
	protected static final int m_final = 10;
	
}


public class Visibilidad {

	public static void main(String[] args) 
	{
	
		MiClase c = new MiClase();
		MiClase c2 = new MiClase();
		
		c.estatica = 200;
		
		System.out.println("A");
		System.out.println(c.estatica);
		System.out.println(c2.estatica);	
		
		c2.estatica = 20;
		
		System.out.println("B");
		System.out.println(c.estatica);
		System.out.println(c2.estatica);	
		
	}

}
