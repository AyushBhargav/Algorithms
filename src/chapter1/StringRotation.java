package chapter1;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		s2 += s2;
		System.out.println(s2.contains(s1));

	}

}
