import java.util.ArrayList;
import java.util.Scanner;


class Registro
{
	String nombre;
	int numero;
	Registro(String nombre, int numero)
	{
		this.nombre = nombre;
		this.numero = numero;
	}
}

public class Array {

	public static void main(String[] args) 
	{
		ArrayList<Registro> registros = new ArrayList<Registro>();
		
		
		Scanner s = new Scanner (System.in);
		
		int opcion;
		do
		{
			System.out.println("Agenda");
			System.out.println("1 Agregar");
			System.out.println("2 Imprimir");
			System.out.println("3 Salir");
			System.out.println("Opcion: ");
			opcion = s.nextInt();
			
			if(opcion == 1)
			{
				System.out.print("Nombre: ");
				String nombre = s.next();
				System.out.print("Numero: ");
				int numero = s.nextInt();
				registros.add(new Registro (nombre, numero));
					
			}
			if (opcion == 2)
			{
				for(int i = 0; i < registros.size(); i++)
				{
					System.out.print(registros.get(i).nombre);
					System.out.print(" - ");
					System.out.println(registros.get(i).numero);
					System.out.println("/n");
				}
			}
			
			
		}while(opcion != 3);
	
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		/*String mi_arreglo[] = new String[3];
		mi_arreglo[2] = "Hola";
		mi_arreglo[1] = "Mundo!";
		mi_arreglo[0] = "Prueba";
		
		
		for(int i = 0; i < mi_arreglo.length; i++)
			System.out.println(mi_arreglo[i]);*/
		

	}

}
