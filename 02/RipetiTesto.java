public class RipetiTesto {
    public static void main(String[] args) {
        String s;

        System.out.println("Inserire una stringa:");
        s = SIn.readLine();
        System.out.println("La tua stringa: ");

        for (int i=0; i<5; i++)
            System.out.println(s + " " + s.length());
    }
}
