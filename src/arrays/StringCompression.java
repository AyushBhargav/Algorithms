package arrays;

public class StringCompression {
	
	public static String stringCompression(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 0; i < s.length(); i++) {
			if(i == s.length() - 1 || s.charAt(i) != s.charAt(i+1)) {
				sb.append(s.charAt(i));
				sb.append((char)('0' + count));
				count = 1;
			}
			else
				count++;
		}
		String s1 = sb.toString();
		if(s1.length() > s.length())
			return s;
		return s1;
	}

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(stringCompression(s));
	}

}
