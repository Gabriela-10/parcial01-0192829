import java.util.Scanner;   

public class Ejecicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][5]; 
        int mayor=0;
        int posicion=0;
        for (int i =0 ; i<4; i++){
            int sumaMaquinas =0;
            
            for (int j= 0; j<5; j++){
                int sumaDias=0;
                System.out.println("ingrese la produccion de la maquina "+i+" del dia "+j);
                matriz[i][j]= scanner.nextInt();
                if (matriz[i][j] < 0 ){
                    System.out.println("valor no valido ingrese valor nuevamente de la maquina "+i+" del dia "+j);
                    matriz[i][j]= scanner.nextInt();
                }
                sumaDias=sumaDias+matriz[i][j];
                sumaMaquinas= sumaMaquinas+ matriz[i][j];
                System.out.println("valor de los dias "+sumaDias);
                System.out.println("valor de las maquinas "+sumaMaquinas);
                if (mayor < matriz[i][j]){
                mayor=matriz[i][j];
                posicion=i;
             }
            }
        }
    }
}
