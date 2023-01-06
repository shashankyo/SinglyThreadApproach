package singltthreadedapproach;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	try {
		System.out.println("Banking started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account number");
		int an = scan.nextInt();
		System.out.println("Enter the password");
		int pw = scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Take your money");
		System.out.println("Banking ended");
		
		
		System.out.println("addition started");
		int a=10,b=20;
		int c = a+b;
		Thread.sleep(5000);
		System.out.println(c);
		System.out.println("addition ended");
		System.out.println("loop started");
		for(int i=1;i<= 10;i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
		
	}
	
	catch(Exception e)
	{
		System.out.println("Exception handled");
	}
}
}
