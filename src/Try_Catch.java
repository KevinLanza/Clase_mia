

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		
		/*Scanner s = new Scanner (System.in);
		
		System.out.print("Ingrese un numero: ");
		int a,b;
		try
		{
			
			a = s.nextInt();
			b = 10/a;
		}catch(InputMismatchException e)
		{
			
			System.out.println("El usuario no ingreso un numero");
			a = 0;
			b =	0;	
		}*/
		
		Scanner s = new Scanner (System.in);
		
		
		try
		{
		
			System.out.print("Ingrese a : ");
			int a = s.nextInt();
			System.out.println("Ingrese b: ");
			int b = s.nextInt();
			System.out.println("a/b = " + a/b);
			
			
		}catch(InputMismatchException mi_exception)
		{
			System.out.println("Error: No se ingreso un entero. ");
			
		}catch(ArithmeticException mi_exception)
		{
			System.out.println("Error: no se puede dividir entre 0");
			
		}catch(Exception mi_exception) 
		{
			System.out.println("Error desconocido.");
			
		}finally
		{
			System.out.print("Final del programa.");
		}

	}

}
