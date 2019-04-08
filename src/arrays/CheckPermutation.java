package arrays;

public class CheckPermutation {
	
	public static boolean checkPermutation(String str, String str2) {
		if(str.length() != str2.length())
			return false;
		int[] chars = new int[128];
		for(char s : str.toCharArray()) {
			chars[(int)s]++;
		}
		for(char s: str2.toCharArray()) {
			if(chars[(int)s] == 0)
				return false;
			chars[(int)s]--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "CHIPS";
		String str2 = "SHICP";
		System.out.println(checkPermutation(str, str2));
		String str3 = "ABCD";
		String str4 = "ABBD";
		System.out.println(checkPermutation(str3, str4));
	}

}
