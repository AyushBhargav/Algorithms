package chapter1;

public class URLify {
	
	public static String urlify(char[] arr, int len) {
		int spaces = 0;
		for(int i= 0 ;i < len; i++) {
			if(arr[i] == ' ')
				spaces++;
		}
		int index = len + 2 * spaces - 1;
		for(int i = len-1; i >= 0 && spaces > 0; i--) {
			if(arr[i] == ' ') {
				arr[index--] = '0';
				arr[index--] = '2';
				arr[index--] = '%';
				continue;
			}
			arr[index] = arr[i];
			index--;
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr John Smith      ";
		System.out.println(urlify(str.toCharArray(), 13));
	}

}
