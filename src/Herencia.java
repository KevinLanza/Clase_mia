class Padre
{
	int x;
	Padre()
	{
		System.out.println("Constructor del Padre");
	}
	Padre (int x)
	{
		this.x = x;
		System.out.println("Constructor2 del Padre");
	}
	Padre (int arr[])
	{
		this.x = x;
		System.out.println("Constructor3 del Padre");
	}
}

class OtroHijo extends Padre
{
	OtroHijo()
	{
		super (new int[4]);
		System.out.println("Constructor del Hijo");
	}
}
public class Herencia {
	

	public static void main(String[] args) {
		
		OtroHijo o = new OtroHijo();
		

	}

}
