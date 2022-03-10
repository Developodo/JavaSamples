package Vectores;
public class Vectores {
    public static void main(String[] args) {
        int n=6;
        String frase = "Hola";
        int[] vector = new int[3];
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }

        int[][] tablero=new int[3][3];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
