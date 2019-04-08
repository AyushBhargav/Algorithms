package arrays;

public class OneAway {
	
	public static boolean oneAway(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length()) > 1)
			return false;
		String first = (s1.length() > s2.length()) ? s1 : s2;
		String second = (s1.length() > s2.length()) ? s2 : s1;
		boolean foundDifference = false;
		int index1 = 0, index2 = 0;
		while(index1 < first.length() && index2 < second.length()) {
			if(first.charAt(index1) != second.charAt(index2)) {
				if(foundDifference)
					return false;
				foundDifference = true;
				if(first.length() > second.length()) {
					index1++;
					continue;
				}
			}
			index1++;
			index2++;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "PALE";
		String s2 = "BAE";
		System.out.println(oneAway(s1, s2));

	}

}
