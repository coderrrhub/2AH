package Lecture5;

public class InverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int pos = 1;
		int inverse = 0;
		while(n > 0) {
			int dig = n % 10;
			inverse = inverse + ((int)Math.pow(10, dig-1) * pos);
			n /= 10;
			pos++;
		}
		
		System.out.println(inverse);
	}

}
