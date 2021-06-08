package competetive;

class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer.parseInt("19");
		//System.out.println(myParseInt("19"));
		System.out.println(isPrimeNumberSqRt(29));
	}



	private static boolean isPrimeNumber(int i) {
		int count=0;
		//brute loop from 1 to i
		for (int j = 2; j < i; j++) {
			if(i % j ==0)
				return false;
		}
		return true;

	}
	private static boolean isPrimeNumberSqRt(int i) {
		int count=0;
		//brute loop from 1 to i
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if(i % j ==0)
				return false;
		}
		return true;

	}
}
