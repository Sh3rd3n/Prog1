import java.util.Scanner;

public class StringaMax {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, max = 0;
		String s, maxs = "";
		int cnt = 0;
		boolean continua = true;
		
		System.out.println("Inserire delle stringhe. Due volte Invio per terminare : ");
		
		do {
			s = sc.nextLine();
			n = s.length();
			
			if (n==0) continua = false;
			else {
				cnt++;
				if (n > max) {
					maxs = s;
					max = n;
				}
			}
			//System.out.println("ho scritto " (int)n + " " + s);
			
		} while (continua == true);	

		if(cnt>0)
			System.out.println("La stringa di lunghezza massima è " + maxs);
		else System.out.println("Non hai inserito stringhe valide.");
	}	
}