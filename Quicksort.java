import java.util.Random;
/**
 *Programa Quicksort define elementos aleatorios e imprimimos un arreglo
 *Objetivo mostrar como funciona el algoritmo quicksort
 *@author Jesus Alberto Rivera Mora
 *@version 1.0
 */
public class Quicksort{
    public static void main(String [] args){
	Random rnd = new Random();
	    int [] arr = new int [100000];
	for(int i = 0; i < arr.length; i++){
	    arr[i] = rnd.nextInt(100000);
	}
	System.out.println("Elementos desordenados");
	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i]+",");//Imprime el arreglo random
	}
	System.out.print("\n");
	System.out.println();
	quickSort(arr, 0, arr.length-1);
	System.out.println("Elementos ordenados");
	for(int i = 0; i< arr.length; i++){
	    System.out.print(arr[i]+ ", ");//Imprime el arreglo ordenado
	}
    }
    /**
     *Metodo que define el algoritmo quicksort
     *@param int [] arr
     *@param int izq
     *@param int der
     */
    public static void quickSort(int[] arr, int izq, int der){
	int pivote = arr[izq];//Toma el primer elemento como pivote
	int i = izq;//Iniciamos el recorrido de izquierda a derecha
	int j = der;//Iniciamos el recorrido de derecha a izquierda

	while(i<j){
	    while(arr[i] <= pivote && i<j){//Encuentra el elemento mayor que pivote
		i++;
	    }
	    while(arr[j]>pivote){//Encuentra el elemento menor que pivote
		j--;
	    }
	    if(i<j){
		cambiar(arr, i, j);//Cambia los elementos  del arreglo
	    }
	}
	arr[izq] = arr[j];//Los elementos menores a la izquierda 
	arr[j] = pivote;//y los mayores a la derecha

	if(izq < (j - 1)){
	    quickSort(arr, izq, j - 1);//Ordena el subarreglo izquierdo
	}
	if(j + 1 < der){
	    quickSort(arr, j + 1, der);//ordena el subarreglo derecho
	}
    }
    /**
     *Metodo que intercambia posiciones del arreglo
     *@param int[] arr
     *@param int a
     *@param int b
     *
     */
    private static void cambiar(int[] arr, int a, int b){
	int aux = arr[a];
	arr[a] = arr[b];
	arr[b] = aux;
    }
}
