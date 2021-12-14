import java.util.Random;
/**
 *Programa Bubblesort utilizamos un arreglo de elementos aleatorios e imprimimos
 *el arreglo
 *Objetivo mostrar como funciona el algoritmo de ordenamiento Bubblesort
 *@author Jesus Alberto Rivera Mora
 *@version 1.0
 */
public class Bubblesort{
    public static void main(String [] args){
	Random rnd = new Random();
	int [] arr = new int [100000];
	for(int i = 0; i < arr.length; i++){
	    arr[i] = rnd.nextInt(100000); 
	}
	System.out.println("Elementos desordenados");
	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i]+ ",");//Imprime el arreglo aleatoriamente
       
	}
	System.out.print("\n");
        System.out.println();
	bubblesort(arr);
        System.out.println("Elementos ordenados");
	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i]+ ", ");//Imprime el arreglo ordenado por
                                           //ordenamiento Bubblesort
	}
    }
    /**
     *Metodo que define el algoritmo de ordenamiento Bubblesort
     *@param int[] arr
     */
    public static void bubblesort(int[] arr) {
	for(int i = 0; i < arr.length; i++){
	    for (int j = 0; j < arr.length - 1; j++){
		if(arr[j] > arr[j+1]) {//Verifica que los elementos
		                       //esten en orden
		    int temp = arr[j];//Si no estan ordenados
		    arr[j] = arr[j+1];//intercambiamos los
		    arr[j + 1] = temp;//elementos		   
		}
	    }
	}
    }
}
