
public class PalindromePermutation {
	
	public static boolean isPalindromePermutation(String s) {
		s = s.toLowerCase();
		int[] arr = new int[128];
		int len = 0;
		for(char c : s.toCharArray()) {
			if(c == ' ')
				continue;
			arr[(int)c]++;
			len++;
		}
		boolean middleFlag = false;
		if(len % 2 == 0) {
			middleFlag = true;
		}
		for(int i = 0; i < 128; i++) {
			if(arr[i] % 2 != 0) {
				if(!middleFlag)
					middleFlag = true;
				else
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "AB CD AB";
		System.out.println(isPalindromePermutation(s));

	}

}
