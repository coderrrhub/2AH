package Lecture4;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 14;
        
        isEvenOrOdd(n);
        
        int m = 15;
        isEvenOrOdd(m);
        
	}
	
	
	 static  void isEvenOrOdd(int n) {
		if(n % 2 == 0) {
        	System.out.println(n + " is a even num");
        } else {
        	System.out.println(n + " is not a even num");
        }
	}

}
