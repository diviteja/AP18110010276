# AP18110010276
package javapoint;

import java.util.Scanner;

public class fibinocci 
{
	static int n1=0,n2=1,n3;
	public static void Recfib(int noss) {
		
		if(noss > 0){
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(""+n3);
			
			
			Recfib(noss-1);
		}
		
		
	}	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int noss =x.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		Recfib(noss-2);
		x.close();
	}
	

}
