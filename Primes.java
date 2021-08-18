# AP18110010276
package javapoint;

import java.util.Scanner;

public class Primes {
	static int i,flag =0;
	public static void PrimeFinder(int n) {
		if(n>0)
		{
			for (i =2;i < n;i ++) {
				if(n%i == 0) {
					System.out.println(n +" is not a prime");
					flag += 1;
					break;
				}
				
			if(flag == 0) {
				System.out.println(n +" is prime");
			}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int num = input.nextInt();
		PrimeFinder(num);
		input.close();		
	}

}
