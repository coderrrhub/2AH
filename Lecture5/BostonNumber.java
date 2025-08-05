package Lecture5;

public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		int sum1 = sumOfDigit(n);
		int sum2 = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				while(n % i == 0) {
					sum2 += sumOfDigit(i);
					n = n / i;
				}
			}
		}
		
		
		
		
//		for(int i = 1; i <= n; i++) {
//			if(n % i == 0 && isPrimeNo(i)) {
//				
//				// no of times 
//				int cnt = countNoOfTimes(n, i);
//				sum2 += (cnt * sumOfDigit(i));
//			}
//		}

		if(sum1 == sum2 ) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}
	
	static int countNoOfTimes(int n, int factor) {
		int cnt = 0;
		while(n % factor == 0) {
			cnt++;
			n = n / factor;
		}
		
		return cnt;
	}
	
	static boolean isPrimeNo(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	static int sumOfDigit(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		
		return sum;
	}

}
