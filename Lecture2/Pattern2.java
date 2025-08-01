package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		while(row <= 5) {
			int counter = 1;
			while(counter <= 5) {
				System.out.print(row);
				counter++;
			}
			System.out.println();
			row++;
		}
	}

}
