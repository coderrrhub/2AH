package Lecture3;

public class Selection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++ ) {
			if(i % 2 == 0) {
				continue;  // it won't execute the below line and move to the updation part
			}
			
			if( i == 7) {
				break;
			}
			System.out.println(i);
		}
	}

}
