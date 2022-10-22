public class Ordine {
    public static void main(String[] args) {
        int v1=8, v2=2, v3=6, tmp;

        System.out.println("Prima: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
        if(v2 > v3){
            tmp = v3;
            v3 = v2;
            v2 = tmp;   // v2 < v3
            if(v1 > v3){
                tmp = v3;
                v3 = v1;
                v1 = tmp;   // v1 < v2 < v3
            }
        }
        if(v1 > v2){
            tmp = v1;
            v1 = v2;
            v2 = tmp;   //ora v1 < v2 
            if(v2 > v3){
                tmp = v3;
                v3 = v2;
                v2 = tmp;   // v2 < v3
            }
        }
        
        System.out.println("Dopo:  v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
        
    }
}
