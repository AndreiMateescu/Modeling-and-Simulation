package temaPetri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> listaComenzi = new ArrayList<Integer>();
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		int a =2;

		int b =3; 

		int cafea1 =4;
		
		int cafea2 =5;

		int cafea3 =6; 
		
		ReteaPetri reteauaMea = new ReteaPetri(a,b,cafea1,cafea2,cafea3);
		System.out.println("Introduceti comenzi\n");
		while(true)
		{
			
			int z = keyboard.nextInt();
			listaComenzi.add(z);
			reteauaMea.compute(z);
		}
		
		
	}
}
