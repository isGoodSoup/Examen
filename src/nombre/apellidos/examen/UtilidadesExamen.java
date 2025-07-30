package nombre.apellidos.examen;

import java.util.Arrays;
import java.util.Scanner;

public class UtilidadesExamen {
	
	static Scanner scan = new Scanner(System.in);
	static int promedio;
	
	public static void main(String[] args) {
		
		filtrarMayoresQuePromedio(encontrarExtremos(calcularPromedio(mostrarArray(crearArray())), promedio));
	}
	
	public static int[] crearArray() {
		
		int reply = 0;
		
		System.out.println("Introduce el tamaño del array: ");
		
		int tamanho = scan.nextInt();
		tamanho += 1;
		int[] array = new int[tamanho];
		
		System.out.println("A continuación, introduce los valores \nque se guardarán en el Array");
		
		for (int i = 0; i < tamanho - 1; i++) {
			
			reply = scan.nextInt();
			array[i] = reply;
		}
		
		return array;
	}
	
	public static int[] mostrarArray(int[] array) {
		
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	public static int[] calcularPromedio(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			
			promedio += array[i];
//			System.out.println("[Debug] " + "Valor añadido al promedio: " + promedio);
		}
		
		System.out.println("[Debug] Sumatorio: " + promedio);
		promedio = (promedio)/array.length;
		System.out.println("Promedio: " + promedio);
		
		array[array.length - 1] = promedio;
		System.out.println("[Debug] " + Arrays.toString(array));
		
		return array;
	}
	
	public static int[] encontrarExtremos(int[] array, int promedio) {
		
		promedio = array[array.length - 1];
		
		for (int i = 0; i < array.length - 1; i++) {
			
			if (i > promedio) {
				int max = i;
				System.out.println("Máximo: " + max);
			} else {
				System.out.println("Máximo: " + "no tengo ni idea");
				break;
			}
		}
		
		return array;
	}
	
	public static int[] filtrarMayoresQuePromedio(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > array[array.length - 1]) {
				System.out.println("El número " + i + " es mayor que " + array[array.length - 1]);
			}
		}
		
		return array;
	}
	
	
}
