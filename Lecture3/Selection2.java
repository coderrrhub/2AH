package Lecture3;

public class Selection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 short day = 12;
		char day = 'a';
//		 long day = 12;
//		int day = 6;
		final int x = 1;
		final int y = 2;
		final int z = 3;
		switch(day) {
		case x: System.out.println("Mon");
				System.out.println("Hello");
		break;
		case y: System.out.println("Tue");
		break;
		case z: System.out.println("Wed");
		 case 2 + 4: System.out.println("Thursday");
		  case z + y: System.out.println("Hel");
		break;
		default: System.out.println("No day");
		}
	}

}
