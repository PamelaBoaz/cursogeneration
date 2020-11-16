package PacoteJava;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		float n1, n2, n3, total, media;
		System.out.println("Entre com a primeira nota:");
		n1 = ler . nextInt();
		
		System.out.println("\n Entre com a segunda nota:");
		n2 = ler . nextInt();
		
		System.out.println("\n Entre com a terceira nota:");
		n3 = ler . nextInt();
		
		total = (n1*2)+(n2*3)+(n3*5);
		media = total/10;
		
		System.out.println("\n 10Sua média ponderada é:" +media);
		
		
		
		
				
		
		
	}

}
