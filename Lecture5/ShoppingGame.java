package Lecture5;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int steps1 = countSteps(m, 1); // Ayush
		int steps2 = countSteps(n, 2); // Harshit
		if(steps1 > steps2) {
			System.out.println("Ayush");
		} else {
			System.out.println("Harshit");
		}
		
	}
	
	static int countSteps(int m, int starting) {
		int steps = 0;
		int i = starting;
		int totalBuy = 0;
		while(totalBuy + i <= m) {
			steps++;
			i += 2;
			totalBuy += i;
		}
		
		return steps;
	}

}
