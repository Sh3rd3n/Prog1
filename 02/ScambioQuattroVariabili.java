public class ScambioQuattroVariabili {
    public static void main(String[] args) {
        int v1 = 1, v2 = 2, v3 = 3, v4 = 4;

        System.out.println("Prima: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + ", v4 = " + v4);

        v1 = v1 + v2 + v3 + v4;
        v4 = v1 - (v2 + v3 + v4); // = v1
        v3 = v1 - (v2 + v3 + v4); // = v4
        v2 = v1 - (v2 + v3 + v4); // = v3
        v1 = v1 - (v2 + v3 + v4); // = v2

        System.out.println("Dopo: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + ", v4 = " + v4);
    }
}
