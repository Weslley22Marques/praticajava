package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class inteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		
		System.out.println("Quantidade de numeros a ser inserido: ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros Negativos: ");
		
		for (int i= 0; i<n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
