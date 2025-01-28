package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class rooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		
		System.out.println("How many rooms will be rented? ");
		n =sc.nextInt();
		
		String[] name = new String[n];
		String[] email = new String[n];
		int[] room = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) +": ");
			
			System.out.print("Name: ");
			name[i] = sc.next();
			
			System.out.print("Email: ");
			email[i] = sc.next();
			
			System.out.print("Room: ");
			room[i] =  sc.nextInt();
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < n ; i++) {
			if (name[i] != null) {
				System.out.print(room[i] + ": " + name[i] + ", " + email[i]);
				System.out.println("");
			}
		}
		
		sc.close();
	}

}
