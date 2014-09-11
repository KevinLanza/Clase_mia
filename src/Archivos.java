import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {
	
/*		try
//		{
//		PrintWriter escritor = new PrintWriter("archivo","UTF-8");
//		escritor.write("otra prueba hgaskfh ahgsfjh ahsjfh ahsjfhb ahsfkak");
//		escritor.flush();
//		}catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
			File archivo = new File("archivo");
			Scanner s = new Scanner (archivo);
			int mayor = -9999;
			while(s.hasNext())
			{
				int num = s.nextInt();
				if (num>mayor)
					mayor=num;
			}
			System.out.print("El mayor es: "+mayor);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}*/
		
	//////////////////////////////////////////////////////////////////////////	
		
		Scanner s = new Scanner(System.in);
		int opcion;
		
		
		do
		{
			System.out.println("Menu");
			System.out.println("1 Agregar animal");
			System.out.println("2 Imprimir");
			System.out.println("3 Guardar");
			System.out.println("4 Cargar");
			System.out.println("5 Salir");
			System.out.println("Opcion: ");
			opcion = s.nextInt();
			
		}while(opcion !=5);
	}

}
