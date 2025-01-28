package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		double sum, media;
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		
			sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += vetor[i];
		}
		
		media = sum / n;
		
		System.out.print("Valores = ");
		
		for (int i = 0; i < n ; i++) {
			System.out.printf("%.1f %n", vetor[i]);
		}
		
		System.out.println("Valores = " + sum);
		
		System.out.println("Media = " + media);
		
		sc.close();
	}

}
