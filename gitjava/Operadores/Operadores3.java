package PacoteJava;

import java.util.Scanner;

public class Operadores3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a, b, c, r, s, d;
		
		System.out.println("Entre com valor de A:");
		a = ler.nextInt();
		
		System.out.println("\n Entre com valor de B:");
		b = ler.nextInt();
		
		System.out.println("\n Entre com valor de C:");
		c = ler.nextInt();
		
		r = (a+b)*(a+b);
		
		s = (b+c)*(b+c);
		
		d= (r+s)/2;
		
		System.out.println("O resultado é:" +d);
		
		
		
		
		
		
		
	}

}
