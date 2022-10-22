
// Esercizio: Scambio di variabili all'interno del metodo main
// utilizzando delle variabili di supporto
public class ScambioVariabili {

    /* main è il metodo principale, che avvia il programma. 
     * Serve alla macchina virtuale, cioè al comando java per 
     * iniziare l'esecuzione del codice Java 
     * nel file ScambioVariabili.class */
    public static void main(String[] args) {
        int x;  // RICORDA: il ';' separa due istruzioni in sequenza
        int y;
        int tmp;
        System.out.println("Inserire una variabile x: ");
        x = SIn.readInt();
        System.out.println("Inserire una variabile y: ");
        y = SIn.readInt();

        System.out.println("Prima dello scambio: x = " + x + ", y = " + y);

        // ESERCIZIO: scambia il valore di x con quello di y
        // scrivere qui il codice

        tmp = x;
        x = y;
        y = tmp;
        
        System.out.println("Dopo lo scambio:     x = " + x + ", y = " + y);

        boolean t = true;
        boolean f = false;
        
        System.out.println("Prima dello scambio: t = " + t + ", f = " + f);

        f = !f;
        t = !t;
        System.out.println("Dopo lo scambio:     t = " + t + ", f = " + f);
    } // fine del main
    
} // fine della classe
