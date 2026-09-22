
import java.util.Scanner;   
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sectores = new int[10];
        int suma=0;
        int promedio;
        int mayor=0;
        int posicion=0;
        for (int i =0 ; i<=10; i++){
            System.out.println("ingrese cantidad del sector "+i);
            sectores[i]= scanner.nextInt();
            if (sectores[i]<0){
                System.out.println("valor no valido ingrese de nuevo el valor "+i);
                sectores[i]= scanner.nextInt();
            }
            suma= suma+ sectores[i];
             
             if (mayor < sectores[i]){
                mayor=sectores[i];
                posicion=i;

             }
        }
        promedio= suma/10;
        System.out.println("el consumo total de los 10 sectores es "+ suma);
        System.out.println("el promedio de los sectores es "+promedio);
        System.out.println("el mayor de los sectores es "+ mayor +" con posicion "+posicion);

    }
}
