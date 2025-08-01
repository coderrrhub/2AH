package Lecture2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		int space = N-1;
		int star = 1;
		while(row <= N) {
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			
			int counter = 1;
			while(counter <= star) {
				System.out.print("*");
				counter++;
			}
			// preparation for the next line
			System.out.println();
			row++;
			star++;
			space--;
		}
	}

}
