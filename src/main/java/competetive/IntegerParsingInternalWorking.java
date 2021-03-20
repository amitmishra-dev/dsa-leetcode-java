package competetive;

class IntegerParsingInternalWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer.parseInt("19");
		System.out.println(myParseInt("19"));
		
	}

	private static int myParseInt(String s) {
		char[] c= s.toCharArray();
		int num =0;
		for (int i = 0; i < c.length; i++) {
			num *= 10;
			num += s.charAt(i) - '0';
			System.out.println(num);
		}
		return num;
	}


}
