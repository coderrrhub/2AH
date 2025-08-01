package Lecture2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		while(row <= 5) {
			int counter = 1;
			while(counter <= row) {
				System.out.print("*");
				counter++;
			}
			System.out.println();
			row++;
		}
	}

}
