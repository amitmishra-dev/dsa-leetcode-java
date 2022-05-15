package competetive.StringProg;

public class LongestSubStringNonRepeating {

	/**
	 * Longest substring and it should be NonRepeating
	 * 
	 * 
	 * g : gububgvfk : : ===>> Final string not contain- size 1:: size :: 1 Array
	 * length:: 1 g::::: g : ububgvfk : g : sizes comariso 1:: > :: 0 >> copied into
	 * prev string : g Array length:: 2 g::::: g u : bubgvfk : g : g ===>> Final
	 * string not contain- size 2:: size :: 2 Array length:: 2 gu::::: g b : ubgvfk
	 * : gu : g ===>> Final string not contain- size 3:: size :: 3 Array length:: 2
	 * gub::::: g u : bgvfk : gub : g sizes comariso 3:: > :: 1 index substring:: b
	 **** >> copied into prev string : gub Array length:: 2 bu::::: gub b : gvfk : bu :
	 * gub sizes comariso 2:: > :: 3 index substring:: u Array length:: 2 ub:::::
	 * gub g : vfk : ub : gub ===>> Final string not contain- size 3:: size :: 3
	 * Array length:: 2 ubg::::: gub v : fk : ubg : gub ===>> Final string not
	 * contain- size 4:: size :: 4 Array length:: 2 ubgv::::: gub f : k : ubgv : gub
	 * ===>> Final string not contain- size 5:: size :: 5 Array length:: 2
	 * ubgvf::::: gub k : : ubgvf : gub ===>> Final string not contain- size 6::
	 * size :: 6 Array length:: 2 ubgvfk::::: gub ====>>>>> Final :6
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = lengthOfLongestSubstring("ggububgvfk");
		System.out.println("====>>>>> Final :" + s);
	}

	static int lengthOfLongestSubstring(String s) {

		if (s.contains("f"))
			System.out.println("index :: " +s.indexOf('f'));

		String st1 = "";
		String st2 = "";
		String fst = "";
		String prevFst = new String("");
		int length = s.length();
		for (int i = 0; i < length; i++) {
			st1 = s.substring(i, i + 1);
			st2 = s.substring(i + 1, length);
			String fstpfst = validateFinalString(st1, st2, fst, prevFst);
			String[] arr = fstpfst.split(":");
			System.out.println("Array length::  " + arr.length);
			fst = fstpfst.split(":")[0];
			if (arr.length > 1)
				prevFst = fstpfst.split(":")[1];
			System.out.println(fst + "::::: " + prevFst);
		}
		return Math.max(fst.length(), prevFst.length());

	}

	private static String validateFinalString(String st1, String st2, String fst, String pfst) {
		// TODO Auto-generated method stub
		System.out.println(st1 + " : " + st2 + " : " + fst + " : " + pfst);
		if (!fst.contains(st1)) {
			fst = fst.concat(st1);
			System.out.println("===>> Final string not contain- size " + fst.length() + ":: size ::  " + fst.length());
		} else {
			System.out.println("*** sizes comariso  " + fst.length() + ":: >  ::  " + pfst.length());
			if (fst.length() >= pfst.length()) {
				pfst = fst;
				if (fst.length() > 1) {
					int index = fst.indexOf(st1);
					System.out.println("index substring:: " + fst.substring(index + 1, fst.length()));
					fst = fst.substring(index + 1, fst.length()) + st1;
				} else
					fst = st1;
				System.out.println("****>> copied into prev string : " + pfst);
			} else {
				if (fst.length() > 1) {
					int index = fst.indexOf(st1);
					System.out.println("index substring:: " + fst.substring(index + 1, fst.length()));
					fst = fst.substring(index + 1, fst.length()) + st1;
				} else
					fst = st1;
			}
		}
		return fst + ":" + pfst;
	}
}
