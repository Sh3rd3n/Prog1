import java.util.Scanner;

public class MassimoIntero {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0, x;
		boolean ins = false;

		System.out.println("Inserire numeri interi positivi. 0 per terminare : ");
		
		do {
			x = sc.nextInt();
			if (x > 0) ins = true;
			if (x > max)	
				max = x;
			
		} while (x > 0);	

		if(ins == true)
			System.out.println("Il max è " + max);
		else System.out.println("Nessun valore valido inserito.");
	}
}