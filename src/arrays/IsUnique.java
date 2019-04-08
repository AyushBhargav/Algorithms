package arrays;
import java.util.Arrays;
import java.util.HashMap;

public class IsUnique {
	
	public static boolean isUnique(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int a : arr) {
			if(map.containsKey(a)) {
				return false;
			}
			map.put(a, true);
		}
		return true;
	}
	
	public static boolean isUnique2(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {3,5,4,2,5,9};
		int[] arr2 = {5,3,2,8,9,1};
		System.out.println(isUnique(arr));
		System.out.println(isUnique(arr2));
		System.out.println("----------------");
		System.out.println(isUnique2(arr));
		System.out.println(isUnique2(arr2));
	}

}
