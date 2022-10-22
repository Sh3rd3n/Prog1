public class Mercato {
    
    public static void main(String[] args) {
        boolean continua = true;
        double x=1;  // quantità orecchiette
        double p_o = 1.5;   // prezzo orecchiette
        double p_p = 2.5;  // prezzo pomodori
        double tot = 0; //variabile per tenere il conto del tot carrello
        
        while(continua){
            System.out.println("Inserire il numero dei pacchi di orecchiette: ");
            x = SIn.readDouble();
            tot = tot + x*p_o;
            System.out.println("Inserire il peso dei pomodori: ");
            x = SIn.readDouble();
            tot = tot + x*p_p;
            System.out.println("inserire T per aggiungere articoli e F per terminare.");
            continua = SIn.readLineBoolean();
        }
        
        System.out.println("Spesa totale = " + tot);
        

    }
}
