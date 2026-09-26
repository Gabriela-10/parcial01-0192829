import java.util.Scanner;   

public class Ejecicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][5]; 
        int menorDia=0;
        int posicionDia=0;
        int posicionMaquina=0;
        int sumaMaquinas =0;
        //for para ingresar la matriz
        for (int i =0 ; i<4; i++){
            int sumaDias=0;
            for (int j= 0; j<5; j++){
                System.out.println("ingrese la produccion de la maquina "+(i+1)+" del dia "+(j+1));
                matriz[i][j]= scanner.nextInt();
                if (matriz[i][j] < 0 ){
                    System.out.println("valor no valido ingrese valor nuevamente de la maquina "+(i+1)+" del dia "+(j+1));
                    matriz[i][j]= scanner.nextInt();
                }
                menorDia=matriz[0][0];
                
                //proceso de sumas para el total de la maquina 
                sumaDias=sumaDias+matriz[i][j];
                sumaMaquinas= sumaMaquinas+ matriz[i][j];
                System.out.println("valor de los dias de la maquina "+(j+1)+" es "+sumaDias);

                //hallar el menor dia 
                if (menorDia < matriz[i][j]){
                menorDia=matriz[i][j];
                posicionDia=j;
                posicionMaquina=i;
             }

            }
            System.out.println("valor de todas las maquinas "+sumaMaquinas);
        }
         System.out.println("el menor dia con producion fue el dia "+(posicionDia+1)+" con la maquina "+(posicionMaquina+1)+" y cantidad "+menorDia);
    }
}
