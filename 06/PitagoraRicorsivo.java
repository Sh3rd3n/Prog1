public class PitagoraRicorsivo {
    public static void tavolaPitagorica (int n, int r) {
        if (n == 0) return;
		tavolaPitagorica(n-1, r);
        if(n>=1 && n<10)
            System.out.print(n*r + "\t"); 
        else System.out.println(n*r);
   	
	}
    public static void main(String[] args) {
        for (int i=1; i<=10; i++)
            tavolaPitagorica(10, i);
    }
}
