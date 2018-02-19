package temaPetri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		List<Integer> listaComenzi = new ArrayList<Integer>();
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		int a =2;

		int b =3; 

		int ciocolata1 =4;
		
		int ciocolata2 =5;

		int ciocolata3 =6;
		
		ReteaPetri reteauaMea = new ReteaPetri(a,b,ciocolata1,ciocolata2,ciocolata3);
		System.out.println("Introduceti comenzi\n");
		while(true)
		{
			
			int z = keyboard.nextInt();
			listaComenzi.add(z);
			reteauaMea.compute(z);
		}
		
		
	}
}
