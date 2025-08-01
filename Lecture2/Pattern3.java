package Lecture2;

public class Pattern3 {
	public static void main(String[] args) {
		int row = 1;
		while(row <= 5) {
			int counter = 1;
			while(counter <= 5) {
				System.out.print(counter);
				counter++;
			}
			System.out.println();
			row++;
		}
	}
}
